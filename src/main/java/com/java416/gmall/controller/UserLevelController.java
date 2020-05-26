package com.java416.gmall.controller;

import com.java416.gmall.bean.BookKind;
import com.java416.gmall.bean.User;
import com.java416.gmall.bean.UserLevel;
import com.java416.gmall.service.UserLevelService;
import com.java416.gmall.service.UserService;
import com.java416.gmall.util.MenuTree;
import com.java416.gmall.util.Messges;
import com.java416.gmall.util.TreeNoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserLevelController {

    @Autowired
    private UserLevelService userLevelService;

    @Autowired
    private UserService userService;


    @RequestMapping("/menuTree/selectUserTree")
    @ResponseBody
    public List<MenuTree> selectUserLevelAll(){
        List<UserLevel> userLevels = userLevelService.selectByExample(null);
        //用于把接收到的数据改造成EasyUI tree认识的数据格式
        List<MenuTree> menuTrees = new ArrayList<MenuTree>();
        try {
            menuTrees= TreeNoteUtil.getFatherUserLevleNode(userLevels);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return menuTrees;
    }

    @RequestMapping("/userLevelAdd")
    @ResponseBody
    public Messges userLevelAdd(UserLevel userLevel){
        int rows = userLevelService.insert(userLevel);
        if(rows>0){
            return Messges.success();
        }
        return Messges.error();
    }

    @RequestMapping("/findUserLevelById")
    @ResponseBody
    public Messges userLevelFindById(@RequestParam("id") String id){
        UserLevel rows = userLevelService.selectByPrimaryKey(id);
        return Messges.success(rows);
    }

    @RequestMapping("/userLevel/delete")
    @ResponseBody
    public Messges userLevelDeleteById(@RequestParam("id") String id){
        int rows = userLevelService.deleteByPrimaryKey(id);
        return Messges.success(rows);
    }

    @RequestMapping("/userLevel/update")
    @ResponseBody
    public Messges userLevelUpate(UserLevel userLevel){
        int rows = userLevelService.updateByPrimaryKey(userLevel);
        if(rows>0){
            return Messges.success();
        }
        return Messges.error();
    }

    /*前台调用*/
    @RequestMapping("/getUserDiscount")
    @ResponseBody
    public Messges getUserDiscount(@RequestParam("id") String id){
        User rows = userService.selectByPrimaryKey(id);
        UserLevel userLevel = userLevelService.selectByPrimaryKey(rows.getlId());
        return Messges.success(userLevel.getlDiscount());
    }
}
