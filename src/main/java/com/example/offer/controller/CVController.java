package com.example.offer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CVController {
    @RequestMapping("/MyCV")
    public String department( Model model) {
        System.out.println("跳转测试页面");
        return "test";


    }

    @RequestMapping("/DepartmentList")
    public String department1( Model model) {
        System.out.println("跳转测试页面1");
        return "test1";


    }
}
