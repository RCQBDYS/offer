package com.example.offer.controller;

import com.example.offer.model.ProjectExperience;
import com.example.offer.model.User;
import com.example.offer.model.UserInfo;
import com.example.offer.service.impl.UserServiceImpl;
import com.example.offer.service.impl.userInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
public class UserInfoController {
    @Resource
    @Autowired
   // Logger logger = LoggerFactory.getLogger(userController.class);
    com.example.offer.service.impl.userInfoServiceImpl userInfoServiceImpl;
    @RequestMapping("/UserInfoAdd")

    public String USerInfoAddDo(@Validated UserInfo UserInfo,String realName,
                               BindingResult bindingResult, HttpServletRequest request,
                               HttpSession httpSession, HttpServletResponse httpServletResponse) {
        String userName= (String)httpSession.getAttribute("userName");
        String userType= (String)httpSession.getAttribute("userType");
        System.out.println("session是："+userName);
        String real= userInfoServiceImpl.check(userName);
if(userType=="应聘者")
        if (real==null|| "".equals(real)){
            return  "userInfoAdd";
        }
   else
        return "index";
   else
       return "index";
    }
    @RequestMapping("/UserInfoAddDo")
    public String USerInfoAddDo(@Validated UserInfo userInfo,
                                BindingResult bindingResult, HttpServletRequest request,
                                HttpSession httpSession, HttpServletResponse httpServletResponse) {
        String userName= (String)httpSession.getAttribute("userName");
        System.out.println(userName);
        userInfo.setUsername(userName);
        int code = userInfoServiceImpl.Insert(userInfo);
        if (code == 1) {
            System.out.println("添加成功");
            return "index";
        } else {

            return "login";

        }


    }
}