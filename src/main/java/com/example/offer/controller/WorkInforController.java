package com.example.offer.controller;

import com.example.offer.model.InterSkill;
import com.example.offer.model.UserInfo;
import com.example.offer.service.impl.InterSkillServiiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WorkInforController {
    @Autowired
    @Resource
    private InterSkillServiiceImpl interSkillServiiceImpl;

    @RequestMapping("/InterviewSkill")
    public String department(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;

        try  {
            out = response.getWriter();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        List<InterSkill> list = new ArrayList<>();
        list = interSkillServiiceImpl.findAll();
            /*System.out.println(userInfo.getUserrealname());*/

            modelMap.addAttribute("interSkillList",list);
            System.out.println("跳转用户基本信息页面1");
            return "interviewSkill";
    }

    @RequestMapping("/InterSkillLook")
    public String InterSkillLook(int id,ModelMap modelMap){
        InterSkill interSkill = interSkillServiiceImpl.selectByPrimaryKey(id);
        modelMap.addAttribute("skill",interSkill);
        return "interSkillLook";
    }

    @RequestMapping("/InterviewSkillSearch")
    public String InterviewSkillSeach(String keyword,ModelMap modelMap){
        List<InterSkill> list = new ArrayList<>();
        System.out.println("keyword:"+keyword);
        list = interSkillServiiceImpl.seacher(keyword);
        modelMap.addAttribute("interSkillList",list);
        return "interviewSkill";
    }
}
