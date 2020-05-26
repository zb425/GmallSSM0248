package com.java416.gmall.controller;

import com.java416.gmall.bean.Address;
import com.java416.gmall.bean.AddressExample;
import com.java416.gmall.bean.OrderBook;
import com.java416.gmall.bean.OrderBookExample;
import com.java416.gmall.service.AddressService;
import com.java416.gmall.util.Messges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/addressAdd")
    @ResponseBody
    public Messges addressAdd(Address address, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String u_id = cookies[2].getValue();
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUIdEqualTo(u_id);
        criteria.andAddTFEqualTo(1);
        List<Address> addresses = addressService.selectByExample(addressExample);
        Address add = addresses.get(0);
        add.setAddTF(0);
        int rows = addressService.updateByPrimaryKey(add);
        if(rows>0){
            address.setAddTF(1);
            address.setuId(u_id);
            int i = addressService.insert(address);
            if(i>0){
                return Messges.success();
            }
        }
        return Messges.error();
    }


    /*前台调用*/
    @RequestMapping("/selectAddressAll")
    @ResponseBody
    public Messges selectAddressAll(@RequestParam("pageNum") Integer currPage,@RequestParam("pageSize") Integer pageSize
            ,@RequestParam("id") String id){
        Map<String, Object> data = new HashMap<>();
        data.put("id",id);
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        List<Address> addresses = addressService.queryAddressBySql(data);
        //return Messges.success(bookInfos);
        return Messges.success(addresses);
    }

    @RequestMapping("/main/getAddressAll")
    @ResponseBody
    public Messges getAddressAll(@RequestParam("u_id") String id){
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria().andUIdEqualTo(id);
        int i = addressService.countByExample(addressExample);
        return Messges.success(i);
    }

    @RequestMapping("/main/deleteAddress")
    @ResponseBody
    public Messges deleteAddress(@RequestParam("u_id") String id){
        int i = addressService.deleteByPrimaryKey(id);
        if(i>0){
            return Messges.success();
        }

        return Messges.error();
    }

    @RequestMapping("/main/updateAddress")
    @ResponseBody
    public Messges updateAddress(@RequestParam("u_id") String id,@RequestParam("add_id") String addId){
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUIdEqualTo(addId);
        criteria.andAddTFEqualTo(1);
        List<Address> addresses = addressService.selectByExample(addressExample);
        Address address = addresses.get(0);
        address.setAddTF(0);

        int i = addressService.updateByPrimaryKey(address);
        if(i>0){
            Address address1 = new Address();
            address1.setAddId(id);
            address1.setAddTF(1);
            int rows = addressService.updateByPrimaryKeySelective(address1);
            if(rows>0){
                return Messges.success();
            }
        }
        return Messges.error();
    }

}
