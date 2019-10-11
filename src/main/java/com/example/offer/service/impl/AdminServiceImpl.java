package com.example.offer.service.impl;

import com.example.offer.mapper.AdminMapper;
import com.example.offer.model.Admin;
import com.example.offer.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangshen
 * @date 2019/9/23 8:31
 * 主要功能说明： 登录的接口实现类
 */

@Service
public class AdminServiceImpl implements adminService {
   @Autowired
    private AdminMapper adminMapper;

   @Override
    public Admin login(String adminName, String adminPassword){
       return adminMapper.login(adminName,adminPassword);
   }




}
