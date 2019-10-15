package com.example.offer.service;

import com.example.offer.model.PostMessage;

import java.util.List;

/**
 * @author wangshen
 * @date 2019/10/15 10:46
 * 主要功能说明：公司岗位发布服务接口
 */
public interface PostService {
    List<PostMessage> listAll();
}
