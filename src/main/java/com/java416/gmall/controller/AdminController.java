package com.java416.gmall.controller;

import com.java416.gmall.bean.Admin;
import com.java416.gmall.bean.AdminExample;
import com.java416.gmall.service.AdminService;
import com.java416.gmall.util.Messges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login")
    //@ResponseBody
    public String login() {
        return "login";
    }

    @RequestMapping("/admin")
    //@ResponseBody
    public String showMain() {
        return "admin";
    }

    @RequestMapping("/adminLogin")
    @ResponseBody
    public Messges showIndex(Admin admin) {
        if(admin.getUsername().equals("")&&admin.getPassword().equals("")){
            return Messges.error();
        }else{
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andUsernameEqualTo(admin.getUsername());
            criteria.andPasswordEqualTo(admin.getPassword());
            List<Admin> admins = adminService.selectByExample(adminExample);
            if(admins.size()>0){
                request.getSession().setAttribute("username",admin.getUsername());
                return Messges.success();
            }
        }
        return Messges.error();
    }


}
