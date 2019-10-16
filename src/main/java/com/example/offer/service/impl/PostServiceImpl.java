package com.example.offer.service.impl;

import com.example.offer.mapper.PostMessageMapper;
import com.example.offer.model.PostMessage;
import com.example.offer.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author wangshen
 * @date 2019/10/15 10:50
 * 主要功能说明：
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMessageMapper messageMapper;


    @Override
    public List<PostMessage> listAll(Long userId) {
        return messageMapper.listAll(userId);
    }

    @Override
    public List<PostMessage> queryByKeyword(String keyword,Long userId) {
        return messageMapper.queryByKeyword(keyword,userId);
    }

    @Override
    public PostMessage oneMessage(Long postId) {
        return messageMapper.oneMessage(postId);
    }

    @Override
    public int update(PostMessage postMessage) {
        return messageMapper.update(postMessage);
    }

    @Override
    public int delete(final Long postId) {
        return messageMapper.delete(postId);
    }

    @Override
    public int save(PostMessage postMessage) {
        return messageMapper.save(postMessage);
    }
}
