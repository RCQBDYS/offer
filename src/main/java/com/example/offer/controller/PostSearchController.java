package com.example.offer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangshen
 * @date 2019/10/11 11:16
 * 主要功能说明：职位搜索的边界类
 */
@Controller
public class PostSearchController {

    @RequestMapping("/postSearch.html")
    public String toPage(Model model){
        return "postSearch";
    }
}
