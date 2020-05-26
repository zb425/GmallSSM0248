package com.java416.gmall.controller;

import com.java416.gmall.bean.*;
import com.java416.gmall.service.UserLevelService;
import com.java416.gmall.service.UserService;
import com.java416.gmall.util.Messges;
import com.java416.gmall.util.SavePicture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserLevelService userLevelService;


    @RequestMapping("/menuTree/userInfo/{id}")
    @ResponseBody
    public List<User> getBookInfoById(@PathVariable("id") String id){
        UserExample example=new UserExample();
        example.createCriteria().andLIdEqualTo(id);
        List<User> users = userService.selectByExample(example);
        return users;
    }


    @RequestMapping(value = "/userLevel/selectAll",method = RequestMethod.POST)
    @ResponseBody
    public Messges selectUserLevelAll(){
        List<UserLevel> userLevels = userLevelService.selectByExample(null);
        return Messges.success(userLevels);
    }

    @RequestMapping(value = "/userInfoAdd",method = RequestMethod.POST)
    @ResponseBody
    public Messges addUserInfo(@RequestParam(value="file",required = false)
                                           MultipartFile file, User user, HttpServletRequest request) throws  Exception{
        user.setuImage(file.getOriginalFilename());
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setuCreatime(df.parse(df.format(new Date())));
        SavePicture.savePicture(file,request);
        int rows =userService.insert(user);
        if(rows>0){
            return Messges.success();
        }

        return Messges.error();
    }

    @RequestMapping("/findUserInfoById")
    @ResponseBody
    public Messges getUserInfoById(@RequestParam("id") String id){

        User users = userService.selectByPrimaryKey(id);
        return Messges.success(users);
    }

    @RequestMapping(value = "/userInfoUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Messges updateUserInfo(@RequestParam(value="file",required = false)
                                       MultipartFile file, User user, HttpServletRequest request) throws  Exception{
        if(file.getOriginalFilename()==null||file.getOriginalFilename().equals("")){
            int rows = userService.updateByPrimaryKeySelective(user);
            if(rows>0){
                return Messges.success();
            }
        }else{
            user.setuImage(file.getOriginalFilename());
            SavePicture.savePicture(file,request);
            int rows = userService.updateByPrimaryKeySelective(user);
            if(rows>0){
                return Messges.success();
            }
        }
        return Messges.error();
    }

    @RequestMapping("/multDeleteUserInfo")
    @ResponseBody
    public Messges multDeleteUserInfo(@RequestParam("multId") String[] multId){
        for (int i = 0; i <multId.length ; i++) {
            UserExample userExample=new UserExample();
            userExample.createCriteria().andUIdEqualTo(multId[i]);
            int rows = userService.deleteByExample(userExample);
        }
        return Messges.success();
    }

    @RequestMapping("/expFindUserInfo")
    @ResponseBody
    public Messges eexpFindUserInfo(@RequestParam("userInfoId") String userInfoId,@RequestParam("userInfoName") String userInfoName){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if(!userInfoId.equals("")&&userInfoId!=null){
            criteria.andUIdEqualTo(userInfoId);
        }
        if(!userInfoName.equals("")&&userInfoName!=null){
            criteria.andUNameLike("%"+userInfoName+"%");
        }
        List<User> users = userService.selectByExample(userExample);
        return Messges.success(users);
    }


    /*前台的通信*/
    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
    @ResponseBody
    public Messges registerUser(@RequestParam(value="file",required = false)
                                       MultipartFile file, User user, HttpServletRequest request) throws  Exception{
        user.setuImage(file.getOriginalFilename());
        user.setlId("4");
        user.setuPassword(DigestUtils.md5DigestAsHex("00000000".getBytes()));
        user.setuJifen(0);
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setuCreatime(df.parse(df.format(new Date())));
        SavePicture.savePicture(file,request);
        int rows =userService.insert(user);
        if(rows>0){
            return Messges.success();
        }

        return Messges.error();
    }


    @RequestMapping("/loginUser")
    @ResponseBody
    public Messges loginUser(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse hsr){

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUNameEqualTo(username);
        criteria.andUPasswordEqualTo(DigestUtils.md5DigestAsHex(password.getBytes()));
        List<User> users = userService.selectByExample(userExample);
        if(users.size()>0){
            Cookie cookie = new Cookie("username",username);
            Cookie cookie1 = new Cookie("id",users.get(0).getuId());
            hsr.addCookie(cookie);
            hsr.addCookie(cookie1);
           return Messges.success();
        }
        return Messges.error();
    }

    @RequestMapping("/upadatePasswordUser")
    @ResponseBody
    public Messges upadatePasswordUser(@RequestParam("phone") String phone, @RequestParam("password") String password, HttpServletResponse hsr){

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUPhoneEqualTo(phone);
        List<User> users = userService.selectByExample(userExample);
        if(users.size()>0){
            Cookie cookie = new Cookie("username","");
            hsr.addCookie(cookie);
            User user = new User();
            user.setuId(users.get(0).getuId());
            user.setuPassword(password);
            userService.updateByPrimaryKeySelective(user);
            Messges.success();
        }
        return Messges.error();
    }




}
