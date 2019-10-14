package com.example.offer.controller;

import com.example.offer.model.User;
import com.example.offer.service.userServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

/**
 * @author wangshen
 * @date 2019/9/29 9:16
 * 主要功能说明：主要是用户的注册以及登录
 */
@Controller
public class userController {

    @Autowired
    userServiceImpl userService;

//    实现日志
    Logger logger = LoggerFactory.getLogger(userController.class);

    @RequestMapping("/")
    public String loginIndex(){
        return "login";
    }

//    处理登录
    @PostMapping("/login")
    public String login(String userName, String userPassword, HttpServletRequest request,HttpSession httpSession){
        logger.info("userName:" + userName + " userPassword: " + userPassword);
        User result = userService.login(userName,userPassword);
        logger.info("result= " + result);
        if(result == null){
            return "login";
        }else{
            httpSession.setAttribute("userName",userName);
            return "index";
        }
    }

//    处理注册信息

    @PostMapping("/register")
    public String register(){

        return "";
    }

}
