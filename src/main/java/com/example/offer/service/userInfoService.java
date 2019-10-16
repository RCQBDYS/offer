package com.example.offer.service;
/**
 * @author liubin
 * @date 2019/10/4
 * 主要功能说明： 用户基本信息的接口类
 **/

import com.example.offer.model.UserInfo;

public interface userInfoService {
     //查询用户个人基本信息
    UserInfo UserInfoList(String userName);
    UserInfo  check(String userName);
}
