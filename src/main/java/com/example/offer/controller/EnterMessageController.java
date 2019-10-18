package com.example.offer.controller;

import com.example.offer.model.EnterpriseMessage;
import com.example.offer.model.PostMessage;
import com.example.offer.service.EMessageService;
import com.example.offer.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author wangshen
 * @date 2019/10/10 10:13
 * 主要功能说明：企业模块的边界类:处理企业信息和岗位信息
 */
@Controller
public class EnterMessageController {

    @Autowired
    EMessageService messageService;

    @Autowired
    PostService postService;


    Logger logger = LoggerFactory.getLogger(userController.class);


    /*跳转至企业信息修改页面*/
    @GetMapping("/enMessageList/{userId}")
    public String enMessageList(@PathVariable("userId") Long userId, Model model){
        logger.info("userId= " + userId);
        EnterpriseMessage enterpriseMessage = messageService.selectUserId(userId);
        model.addAttribute(enterpriseMessage);
        return "enMessageEdit";
    }

    /*企业信息的显示页面*/
    @GetMapping("/enMessageListTable")
    public String enMessageListTable(Model model,HttpSession session){
        Long userId = Long.parseLong(String.valueOf(session.getAttribute("userId")));
        logger.info("userId"+ userId);
        EnterpriseMessage enterpriseMessage = messageService.selectUserId(userId);
        model.addAttribute(enterpriseMessage);
        return "enMessage";
    }

    /*显示公司的招聘信息*/
    @RequestMapping("/postMessage")
    public String toPagePost(Model model,HttpSession session){
        Long userId = Long.parseLong(String.valueOf(session.getAttribute("userId")));
        List<PostMessage> postMessageList = postService.listAll(userId);
        EnterpriseMessage enterpriseMessage = messageService.selectUserId(userId);
        logger.info("enterId"+enterpriseMessage.getEnterId());
        session.setAttribute("enterId",enterpriseMessage.getEnterId());
        logger.info("postMessage" + postMessageList);
        model.addAttribute("postMessageList",postMessageList);
        return "postMessage";
    }

    /*修改企业信息请求*/
    @PostMapping("/editEnterMessage")
    public String editMessage(EnterpriseMessage enterpriseMessage){
        logger.info(enterpriseMessage.toString());
        messageService.update(enterpriseMessage);
        return "redirect:/enMessageListTable";
    }

    /*招聘岗位信息的查询在没有keyword时显示全部页面*/
    @PostMapping("/search/message")
    public String search(String keyword,Model model,HttpSession session){
        Long userId = Long.parseLong(String.valueOf(session.getAttribute("userId")));
        List<PostMessage> postMessageList = postService.queryByKeyword(keyword,userId);
        logger.info("postMessageSearch = " + postMessageList);
        model.addAttribute("postMessageList",postMessageList);
        return "postMessage";
    }

    /*招聘岗位信息的具体显示同时也是修改页面*/
    @GetMapping("/oneself/{postId}")
    public String postMessageEdit(@PathVariable("postId") Long postId,Model model){
        PostMessage postMessage = postService.oneMessage(postId);
        model.addAttribute(postMessage);
        return "postMessageEdit";
    }


    /*招聘信息的修改*/
    @PostMapping("/oneselfMessageEdit")
    public String oneselfMessageEdit(PostMessage postMessage){
        logger.info("postMessage = " + postMessage);
        postService.update(postMessage);
        return "redirect:/postMessage";
    }
    /*删除招聘信息*/
    @DeleteMapping("/delete/{postId}")
    public String deleteMessage(@PathVariable("postId") Long postId){
        postService.delete(postId);
        return "redirect:/postMessage";
    }

    /*跳转至企业添加页面*/
    @GetMapping("/postMessageAdd")
    public String toPostMessageAdd(){
        return "postMessageAdd";
    }

    /*企业岗位信息的添加*/
    @PostMapping("/postMessageSave")
    public String save(PostMessage postMessage){
        logger.info("添加="+postMessage);
        postService.save(postMessage);
        return "redirect:/postMessage";
    }

    //管理企业
    @GetMapping("/enters/{userId}")
    public String findAllEnterp(@PathVariable("userId") Long userId, Model model){
        System.out.println(userId);
        logger.info("post userId = " + userId);
        List<EnterpriseMessage> eList = messageService.findAllEnterp();
        logger.info("postMessage" + eList);
        model.addAttribute("elist",eList);
        return "entermanage";
    }

}
