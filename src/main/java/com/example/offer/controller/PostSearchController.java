package com.example.offer.controller;

import com.example.offer.model.PostMessage;
import com.example.offer.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wangshen
 * @date 2019/10/11 11:16
 * 主要功能说明：职位搜索的边界类
 */
@Controller
public class PostSearchController {

    Logger logger = LoggerFactory.getLogger(userController.class);

    @Autowired
    PostService postService;
    /*岗位信息全全部显示*/
    @GetMapping("/postSearch.html")
    public String toPage(Model model){
        List<PostMessage> postMessageList = postService.postList();
        model.addAttribute("postList",postMessageList);
        return "postSearch";
    }

    /*岗位信息条件搜索*/
    @PostMapping("/search/postMessage")
    public String search(String keyword,Model model){
        logger.info("postKeyword = "+ keyword);
        List<PostMessage> postMessageList = postService.search(keyword);
        model.addAttribute("postList",postMessageList);
        return "postSearch";
    }



}
