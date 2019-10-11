package com.example.offer.service;

import com.example.offer.model.User;

/**
 * @author wangshen
 * @date 2019/9/29 9:24
 * 主要功能说明 ：处理用户登录时，为边界类提供服务的接口
 */


public interface userService {
    User login(String userName,String userPassword);
}
