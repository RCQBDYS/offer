package com.example.offer.controller;

import com.example.offer.model.PostMessage;
import com.example.offer.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class DataCountController {
    @Resource
    @Autowired
    private PostServiceImpl postServiceImpl;

    @GetMapping("/mon")
    public String runTest(Model model){
        //生成实时设备信息
        List<PostMessage> pList = postServiceImpl.findAllPost();
//        List<Double> dl = new ArrayList<>();
        double[] percent = new double[50];
        int sum = 0,i = 0;

        for (PostMessage pm: pList
             ) {
            sum += pm.getPostNum();

            System.out.println(pm.getPostNum());
//            double a = (double)pm.getPostNum();
//            double b = (double)pm.getPostSuccNum();
//            percent[++i] = b/a;
        }
        model.addAttribute("plist",pList);
        model.addAttribute("sum",sum);
        model.addAttribute("percent",percent);
        return "postCount";
    }
}