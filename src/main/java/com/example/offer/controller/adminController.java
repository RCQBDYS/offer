package com.example.offer.controller;

import org.springframework.stereotype.Controller;

/**
 * @author wangshen
 * @date 2019/9/23 8:31
 * 主要功能说明：处理登录与注册请求的边界类（controller）
 */

@Controller
public class adminController {

    /*@Autowired
    adminService adminService;

    *//*日志*//*
    Logger logger = LoggerFactory.getLogger(adminController.class);

    *//*设置初始页面未登录页面login*//*
    @RequestMapping("/")
    public String log(){
        return "login";
    }

    *//*登录处理,不借助mapper映射文件*//*
   @PostMapping("/login")
    public String login(String adminName, String adminPassword, HttpServletRequest request){
        Admin admin = adminService.login(adminName,adminPassword);
        logger.info("你好");
        request.getSession().removeAttribute("notLoginMsg");
        logger.info("adminName :" + adminName + "password : " + adminPassword);
        if (admin == null){
            logger.debug("登录出错");
            request.getSession().setAttribute("loginMsg","账户名或密码错误！");
            return "login";
        }
        else{
            request.getSession().setAttribute("admin" ,admin);
            return "index";
        }
    }
*/

}
