package com.example.offer.controller;

import com.example.offer.model.EnterpriseMessage;
import com.example.offer.service.EMessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangshen
 * @date 2019/10/10 10:13
 * 主要功能说明：企业模块的边界类:处理企业信息和岗位信息
 */
@Controller
public class EnterMessageController {

    @Autowired
    EMessageService messageService;



    Logger logger = LoggerFactory.getLogger(userController.class);


    @GetMapping("/enMessageList/{userId}")
    public String enMessageList(@PathVariable("userId") Long userId, Model model){
        logger.info("userId= " + userId);
        EnterpriseMessage enterpriseMessage = messageService.selectUserId(userId);
        model.addAttribute(enterpriseMessage);
        return "enMessageEdit";
    }

    @RequestMapping("/postMessage.html")
    public String toPagePost(Model model){
        return "postMessage";
    }

    @PostMapping("/editEnterMessage")
    public String editMessage(EnterpriseMessage enterpriseMessage){
        logger.info(enterpriseMessage.toString());
        messageService.update(enterpriseMessage);
        return "index";
    }

}
