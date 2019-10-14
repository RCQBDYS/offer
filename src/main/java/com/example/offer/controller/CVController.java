package com.example.offer.controller;

import com.example.offer.model.ProjectExperience;
import com.example.offer.model.UserInfo;
import com.example.offer.model.WorkExperience;
import com.example.offer.service.impl.ProjectExperienceImpl;
import com.example.offer.service.impl.userInfoServiceImpl;
import com.example.offer.service.impl.workExperiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CVController {

    @Resource
    @Autowired
    userInfoServiceImpl userinfoServiceImpl;

    @Resource
    @Autowired
    workExperiseImpl workexperiseImpl;

    @Resource
    @Autowired
    ProjectExperienceImpl projectExperienceImpl;

    @RequestMapping("/MyCV")
    public String department( ModelMap modelMap) {
        System.out.println("跳转测试页面");
        return "test";


    }

    @RequestMapping("/DepartmentList")
    public String department1( ModelMap modelMap,HttpServletRequest request,HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        String userName = (String)request.getSession().getAttribute("userName");
        try  {
            out = response.getWriter();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(userName != null){
            UserInfo userInfo = userinfoServiceImpl.UserInfoList("userName");
            modelMap.addAttribute("userInfo",userInfo);
            System.out.println("跳转测试页面1");
            return "userinfo";
        }else{
            System.out.println("会话失效，请重新登录！");
            out.print("<script language=\"javascript\">alert('会话失效，请重新登录！');</script>");
            return "redirect:/";
        }



    }

    @RequestMapping("/UserInfoEdit")
    public String UserInfoEdit(@Validated UserInfo userInfo, BindingResult bindingResult, Model model, HttpServletRequest request, HttpSession httpSession){
        int age = userInfo.getUserage();
        String userName = (String)httpSession.getAttribute("userName");
        System.out.println(userName);

        userInfo.setUsername(userName);
        String sex = (String)request.getAttribute("usersex");
        userinfoServiceImpl.UserInfoEdit(userInfo);
        System.out.println("age:"+age );
        return "redirect:/DepartmentList";

    }

    @RequestMapping("/Experise")
    public String Experise( ModelMap modelMap) {
        System.out.println("跳转项目经历页面");
        return "cvprojectExperise";


    }
     //跳转至添加项目页面
    @RequestMapping("/ProjectAdd")
    public String ProjectAdd( ModelMap modelMap) {
        System.out.println("跳转项目添加页面");
        return "projectadd";

    }
    //添加项目信息
    @RequestMapping("/ProjectAddDo")
    public String ProjectAddDo(@Validated ProjectExperience projectExperience,
                               BindingResult bindingResult, HttpServletRequest request,
                               HttpSession httpSession, HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
        String userName = (String)httpSession.getAttribute("userName");
        String startDate = request.getParameter("projectstartdate");
        String endDate = request.getParameter("projectenddate");
        System.out.println("username:"+userName);
        System.out.println("StartTime:"+startDate);
        projectExperience.setProjectstartdate(startDate);
        projectExperience.setProjectenddate(endDate);

        System.out.println("StartTime:"+projectExperience.getProjectstartdate());
        PrintWriter out = null;
        try  {
             out = httpServletResponse.getWriter();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        projectExperience.setUsername(userName);
       System.out.println("跳转项目添加页面11222");
        int code = projectExperienceImpl.insert(projectExperience);
        System.out.println("code:"+code);
        if(code == 1){
            System.out.println("添加成功");
            out.print("<script language=\"javascript\">alert('添加成功！');</script>");
            return "redirect:/ProjectExperienceList";
        }else
        return "projectadd";

    }

    //查询项目经验信息
    @RequestMapping("/ProjectExperienceList")
    public String ProjectList(ModelMap modelMap,HttpSession session){
        String userName = (String)session.getAttribute("userName");
        if(userName != null){
            List<ProjectExperience> list = new ArrayList<>();
            list = projectExperienceImpl.SelectByUserName(userName);
            modelMap.addAttribute("list",list);
            return "cvprojectExperise";
        }else{
           System.out.println("会话失效，请重新登录！");
           return "redirect:/";
        }
    }

    @RequestMapping("/ProjectExperienceDelete")
    public String ProjectDelete(ModelMap modelMap,HttpSession session,int id){
        String userName = (String)session.getAttribute("userName");
        System.out.println(id);
        if(userName != null){
            projectExperienceImpl.deleteByPrimaryKey(id);
            return "cvprojectExperise";
        }else{
            System.out.println("会话失效，请重新登录！");
            return "redirect:/";
        }
    }

    @RequestMapping("/ProjectExperienceEdit")
    public String ProjectEdit(ModelMap modelMap,HttpSession session,int id){
        String userName = (String)session.getAttribute("userName");
        System.out.println(id);
        if(userName != null){
          ProjectExperience projectExperience =  projectExperienceImpl.selectByPrimaryKey(id);
          modelMap.addAttribute("projectExperience",projectExperience);
            return "projectedit";
        }else{
            System.out.println("会话失效，请重新登录！");
            return "redirect:/";
        }
    }

    @RequestMapping("/ProjectEditDo")
    public String ProjectEditDo(ModelMap modelMap,HttpSession session,HttpServletResponse response,ProjectExperience projectExperience){
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try  {
            out = response.getWriter();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String userName = (String)session.getAttribute("userName");

        int code = projectExperienceImpl.updateByPrimaryKey(projectExperience);
        if(code == 1){
            System.out.println("修改成功");
            out.print("<script language=\"javascript\">alert('修改成功！');</script>");
            return "redirect:/ProjectExperienceList";
        }else
            System.out.println("项目信息修改失败");
            out.print("<script language=\"javascript\">alert('修改失败！');</script>");
            return "redirect:/ProjectExperienceList";
    }
}
