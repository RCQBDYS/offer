package com.example.offer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangshen
 * @date 2019/10/10 10:13
 * 主要功能说明：企业模块的边界类:处理企业信息和岗位信息
 */
@Controller
public class EnterMessageController {

    @RequestMapping("/enMessageEdit.html")
    public String toPageEnter(Model model){
        return "enMessageEdit";
    }

    @RequestMapping("/postMessage.html")
    public String toPagePost(Model model){
        return "postMessage";
    }


}
