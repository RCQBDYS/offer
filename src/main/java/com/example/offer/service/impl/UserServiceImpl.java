package com.example.offer.service.impl;

import com.example.offer.mapper.UserMapper;
import com.example.offer.model.User;
import com.example.offer.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangshen
 * @date 2019/9/29 9:26
 * 主要功能说明：userService接口，实现类
 */
@Service
public class UserServiceImpl implements userService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String userName, String userPassword, String userType) {

        return userMapper.login(userName, userPassword, userType);
    }

    public int Insert(User record) {

        return userMapper.insert(record);
    }
    public User check(String userName) {
        return  userMapper.check(userName);
    }
}