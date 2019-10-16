package com.example.offer.controller;

import com.example.offer.mapper.UserMapper;
import com.example.offer.model.ProjectExperience;
import com.example.offer.model.User;
import com.example.offer.service.impl.UserServiceImpl;
import com.example.offer.service.userService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshen
 * @date 2019/9/29 9:16
 * 主要功能说明：主要是用户的注册以及登录
 */
@Controller
public class userController {
    @Resource
    @Autowired
    UserServiceImpl userServiceImpl;

    //    实现日志
    Logger logger = LoggerFactory.getLogger(userController.class);

    @RequestMapping("/")
    public String loginIndex() {

        return "login";
    }

    //    处理登录
    @PostMapping("/login")
    public String login(String userName, String userPassword, String userType,HttpServletResponse response , HttpServletRequest request, HttpSession httpSession) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        logger.info("userName:" + userName + " userPassword: " + userPassword+"userType"+userType);
System.out.println(userType);
        User result = userServiceImpl.login(userName, userPassword,userType);
        logger.info("result= " + result);

        if (result== null || "".equals(result)) {

            PrintWriter out = null;
            String ur="login.html";
            System.out.println("错误");
//            out.print("<script language=\"javascript\">alert('登录失败！');</script>");
//            out.flush();
            out = response.getWriter();
            out.print("<script>alert('用户名或密码错误');window.location.href='"
                    + ur + "';</script>");
            out.flush();
            return "login";
        }
        else {
            httpSession.setAttribute("userName", userName);
            httpSession.setAttribute("userType",result.getUserType() );
            return "index";
        }
    }
//    处理注册信息
    @RequestMapping("/register.html")
    public String register() {
        return "register";
    }

    //    处理登录返回请求
    @RequestMapping("/login.html")
    public String toPage() {
        return "login";
    }

    //     处理注册账号
    @RequestMapping("/regAdd")
    public String ProjectAddDo(@Validated User user,String userName,
                               BindingResult bindingResult, HttpServletRequest request,
                               HttpSession httpSession, HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/html;charset=UTF-8");

        UserServiceImpl sel = new UserServiceImpl();
        PrintWriter out = null;
        try {
            out = httpServletResponse.getWriter();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("跳转项目添加页面11222");
        System.out.println();
        logger.info("userName = " + userName);
        User name = userServiceImpl.check(userName);
        if (name== null || "".equals(name)) {
        int code = userServiceImpl.Insert(user);
          System.out.println("code:" + code);



            if (code == 1) {
                System.out.println("添加成功");
                out.print("<script language=\"javascript\">alert('注册成功！');</script>");
                return "login";
            } else {

                return "register";

            }
        }
       // return "login";
            else {
            String ur="register.html";
            out.print("<script>alert('用户名重复');window.location.href='"
                    + ur + "';</script>");
            out.flush();
                return "register";
            }
    }



}




