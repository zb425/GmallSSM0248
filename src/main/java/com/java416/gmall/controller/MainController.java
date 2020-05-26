package com.java416.gmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/show")
    //@ResponseBody
    public String showIndex(){
        return "index";
    }

   /* @RequestMapping("/grid")
    //@ResponseBody
    public String showGrid(){
        return "grid";
    }*/
}
