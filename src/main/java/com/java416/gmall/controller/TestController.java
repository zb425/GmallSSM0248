package com.java416.gmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test")
    //@ResponseBody
    public String say() {
        return "checkout";
    }
}
