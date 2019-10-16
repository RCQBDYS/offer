package com.example.offer.service.impl;


import com.example.offer.mapper.UserInfoMapper;
import com.example.offer.model.User;
import com.example.offer.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

/**
 * @author liubin
 * @date 2019/10/4
 * 主要功能说明： 用户基本信息的接口实现类
 **/

@Service
public class userInfoServiceImpl {

    @Autowired
    private UserInfoMapper userInfoMapper;
    //通过用户名获取个人基本信息
    public UserInfo UserInfoList(String userName){
        return userInfoMapper.UserInfoList(userName);
    }

    public int UserInfoEdit(UserInfo userInfo){
        System.out.println(userInfo.getUserage());
        return userInfoMapper.UserInfoEdit(userInfo);
    }
    public String check(String userName) {
        return  userInfoMapper.check(userName);
    }
    public int Insert(UserInfo record) {

        return userInfoMapper.insert(record);
    }
}
