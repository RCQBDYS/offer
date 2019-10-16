package com.example.offer.controller;

import com.example.offer.model.CV;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
//import org.apache.commons.io.FilenameUtils;

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
        System.out.println(userName);
        try  {
            out = response.getWriter();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(userName != null){
            UserInfo userInfo = userinfoServiceImpl.UserInfoList(userName);
            System.out.println(userInfo.getUserrealname());

            modelMap.addAttribute("userInfo",userInfo);
            System.out.println("跳转用户基本信息页面1"+userInfo.getUserWishJob());
            return "userinfo";
        }else{
            System.out.println("会话失效，请重新登录！");
            out.print("<script language=\"javascript\">alert('会话失效，请重新登录！');</script>");
            return "redirect:/";
        }



    }

    @RequestMapping("/UserInfoEdit")
    public String UserInfoEdit(@Validated UserInfo userInfo, BindingResult bindingResult, Model model, HttpServletRequest request, HttpSession httpSession
                               /*@RequestParam(value="icon",required=false) MultipartFile file*/){
        int age = userInfo.getUserage();
        String userName = (String)httpSession.getAttribute("userName");
        System.out.println(userName);

        userInfo.setUsername(userName);
        String sex = (String)request.getAttribute("usersex");
        /*String name = UUID.randomUUID().toString().replaceAll("-", "");
        //获取图片名称
        String imageName=file.getOriginalFilename();
        //获得文件类型（可以判断如果不是图片，禁止上传）
        //String contentType=file.getContentType();
        //获得文件后缀名
        //String suffixName=contentType.substring(contentType.indexOf("/")+1);
        //获取文件的扩展名
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        //设置图片上传路径
        String filePath = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println(filePath);
        //以绝对路径保存重名命后的图片
        file.transferTo(new File(filePath+"/"+name + "." + ext));
        //把图片存储路径保存到数据库
       // user.setImage("upload/"+name + "." + ext);*/
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
        ProjectExperience projectExperience = new ProjectExperience();
        projectExperience.setProjectname("");
        projectExperience.setProjectrole("");
        projectExperience.setProjectstartdate("");
        projectExperience.setProjectenddate("");
        projectExperience.setProjectcontent("");
        modelMap.addAttribute("projectExperience",projectExperience);
        return "projectadd";

    }
    //添加项目信息
    @RequestMapping("/ProjectAddDo")
    public String ProjectAddDo(@Validated ProjectExperience projectExperience,
                               BindingResult bindingResult, HttpServletRequest request,
                               HttpSession httpSession, HttpServletResponse httpServletResponse,ModelMap modelMap) {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
       // SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
        String userName = (String)httpSession.getAttribute("userName");
        PrintWriter out = null;
        if(bindingResult.hasFieldErrors()) {
            System.out.println("项目名称不能为空");
            modelMap.addAttribute(projectExperience);
            return "projectadd";
        }
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
    public String ProjectList(ModelMap modelMap,HttpSession session,HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try{
            out = response.getWriter();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        String userName = (String)session.getAttribute("userName");
        if(userName != null){
            List<ProjectExperience> list = new ArrayList<>();
            List<WorkExperience> list1 = new ArrayList<>();
            list = projectExperienceImpl.SelectByUserName(userName);
            list1 = workexperiseImpl.selectByUserName(userName);
            CV cv = new CV();
            cv.setProjectExperiencesList(list);
            cv.setWorkExperiencesList(list1);
            System.out.println("项目经历");
            /*for(int i = 0;i< cv.getProjectExperiencesList().size();i++){

                System.out.println(cv.getProjectExperiencesList().get(i));
            }*/
            modelMap.addAttribute("list",cv);
            return "cvprojectExperise";
        }else{
            System.out.println("会话失效，请重新登录！");
            out.print("<script language = \"javascript\">alert('会话失效，请重新登录！');</script>");
         //   out.println ("<script language=javascript>alert('会话失效，请重新登录！');window.location='login.jsp'</script>");
           return "login";
        }
    }
     //按项目id删除项目经历
    @RequestMapping("/ProjectExperienceDelete")
    public String ProjectDelete(ModelMap modelMap,HttpSession session,int id){
        String userName = (String)session.getAttribute("userName");
        System.out.println(id);
        if(userName != null){
            projectExperienceImpl.deleteByPrimaryKey(id);
            return "redirect:/ProjectExperienceList";
        }else{
            System.out.println("会话失效，请重新登录！");
            return "redirect:/";
        }
    }
   //控制跳转至项目经历编辑页面
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
    PrintWriter pw = null;
        try  {pw = response.getWriter();

    }catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    String userName = (String)session.getAttribute("userName");

    int code = projectExperienceImpl.updateByPrimaryKey(projectExperience);
        if(code == 1){
        System.out.println("修改成功");
        pw.print("<script language=\"javascript\">alert('修改成功！');</script>");
        return "redirect:/ProjectExperienceList";
    }else
            System.out.println("项目信息修改失败");
            pw.print("<script language=\"javascript\">alert('修改失败！');</script>");
            return "redirect:/ProjectExperienceList";
}

    //按项目id删除项目经历
    @RequestMapping("/WorkDelete")
    public String WorkDelete(ModelMap modelMap,HttpSession session,int workid){
        String userName = (String)session.getAttribute("userName");
        if(userName != null){
           workexperiseImpl.deleteByPrimaryKey(workid);
            return "redirect:/ProjectExperienceList";
        }else{
            System.out.println("会话失效，请重新登录！");
            return "redirect:/";
        }
    }


    //控制跳转至工作经历编辑页面
    @RequestMapping("/WorkEdit")
    public String WorkEdit(ModelMap modelMap,HttpSession session,int workid){
        String userName = (String)session.getAttribute("userName");
        System.out.println(workid);
        if(userName != null){
            WorkExperience workExperience =  workexperiseImpl.selectByPrimaryKey(workid);
            modelMap.addAttribute("workExperiece",workExperience);
            return "workedit";
        }else{
            System.out.println("会话失效，请重新登录！");
            return "redirect:/";
        }
    }

    //按工作id修改工作经历
    @RequestMapping("/WorkEditDo")
    public String WorkEditDo(ModelMap modelMap,HttpSession session,HttpServletResponse response,WorkExperience workExperience){
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try{
            out = response.getWriter();
        }catch (Exception e){
            e.printStackTrace();
        }
        int code = workexperiseImpl.updateByPrimaryKey(workExperience);
        if(code == 1){
            System.out.println("修改成功");
            out.print("<script language=\"javascript\">alert('修改成功！');</script>");
            return "redirect:/ProjectExperienceList";
        }else {
            System.out.println("工作经验信息修改失败");
            out.print("<script language=\"javascript\">alert('修改失败！');</script>");
            return "redirect:/ProjectExperienceList";
        }
    }

    //查询简历信息
    @RequestMapping("/CVList")
    public String CVList(ModelMap modelMap,HttpSession session,HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;

        String userName = (String)session.getAttribute("userName");
        try{
            out = response.getWriter();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        if(userName != null){
            UserInfo userInfo = userinfoServiceImpl.UserInfoList(userName);
            List<ProjectExperience> list = new ArrayList<>();
            List<WorkExperience> list1 = new ArrayList<>();
            CV cv = new CV();
            list = projectExperienceImpl.SelectByUserName(userName);
            list1 = workexperiseImpl.selectByUserName(userName);
            cv.setProjectExperiencesList(list);
            cv.setWorkExperiencesList(list1);
            cv.setUserInfo(userInfo);

            modelMap.addAttribute("list",cv);
            return "cvlist";
        }else{
            System.out.println("会话失效，请重新登录！");
            out.println("<script language = \"javascript\">alter('会话失效，请重新登录！);</script>");
            return "redirect:/";
        }
    }

    //跳转至添加工作经历页面
    @RequestMapping("/WorkAdd")
    public String WorkAdd( ModelMap modelMap) {
        System.out.println("跳转工作经历添加页面");
        return "workadd";

    }

    //添加项目信息
    @RequestMapping(value = "/WorkAddDo", method = {RequestMethod.GET, RequestMethod.POST})
    public String WorkAddDo(@Validated WorkExperience workExperience,
                               BindingResult bindingResult, HttpServletRequest request,
                               HttpSession httpSession, HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        String userName = (String)httpSession.getAttribute("userName");
        System.out.println(workExperience.getWorkstartdate());

        PrintWriter out = null;
        try  {
            out = httpServletResponse.getWriter();
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        workExperience.setUsername(userName);
        System.out.println("跳转项目添加页面11222");
        int code = workexperiseImpl.insert(workExperience);
        System.out.println("code:"+code);
        if(code == 1){
            System.out.println("添加成功");
            out.print("<script language=\"javascript\">alert('添加成功！');</script>");
            return "redirect:/ProjectExperienceList";
        }else
            return "workadd";

    }
//退出登录
    @RequestMapping("/LoginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("usertype");
        return "redirect:/";

    }
}
