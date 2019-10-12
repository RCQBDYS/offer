package com.example.offer.controller;

import com.example.offer.model.User;
import com.example.offer.service.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangshen
 * @date 2019/9/29 9:16
 * 主要功能说明：主要是用户的注册以及登录
 */
@Controller
public class userController {

    @Autowired
    com.example.offer.service.userService userService;

//    实现日志
    Logger logger = LoggerFactory.getLogger(userController.class);

    @RequestMapping("/")
    public String loginIndex(){
        return "login";
    }

//    处理登录
    @PostMapping("/login")
    public String login(String userName, String userPassword, HttpServletRequest request){
        logger.info("userName:" + userName + " userPassword: " + userPassword);
        User result = userService.login(userName,userPassword);
        logger.info("result= " + result);
        if(result == null){
            return "login";
        }else{
            return "index";
        }
    }

//    处理注册信息

    @RequestMapping("/register.html")
    public String register(){

        return "register";
    }

//    处理登录返回请求
    @RequestMapping("/login.html")
    public String toPage(){
        return "login";
    }
//     处理注册账号
}
