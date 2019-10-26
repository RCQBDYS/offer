package com.example.offer.controller;

import com.example.offer.model.PostMessage;
import com.example.offer.service.PostService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
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

    /*招聘岗位的发布*/
    @GetMapping("/putPost/{postId}")
    public String putMessage(@PathVariable("postId") int postId){
        logger.info("postId " + postId);
        postService.postPut(postId);
        return "redirect:/postPut";
    }

    /*已发布岗位查询*/
    @RequestMapping("/postPut")
    public String toPutPost(Model model,HttpSession session){
        Long userId = Long.parseLong(String.valueOf(session.getAttribute("userId")));
        List<PostMessage> postMessageList = postService.selectPut(userId);
        model.addAttribute("putList",postMessageList);
        return "postPut";
    }

    /*已发岗位模糊查询*/
    @PostMapping("/search/put")
    public String searchPut(String keyword,Model model,HttpSession session){
        Long userId = Long.parseLong(String.valueOf(session.getAttribute("userId")));
        List<PostMessage> postMessageList = postService.searchPut(keyword,userId);
        model.addAttribute("putList",postMessageList);
        return"postPut";
    }

    /*使用地图显示位置信息*/
    @GetMapping("/map")
    public String toMap(){
        return "Map2";
    }



}
