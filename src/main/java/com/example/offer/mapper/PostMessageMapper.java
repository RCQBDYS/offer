package com.example.offer.mapper;

import com.example.offer.model.PostMessage;
import com.example.offer.model.PostMessageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostMessageMapper {

    List<PostMessage> listAll(Long userId);

    List<PostMessage> queryByKeyword(@Param(value="keyword") String keyword,Long userId);

    PostMessage oneMessage(Long postId);

    int update(PostMessage postMessage);

    int delete(Long postId);

    int  save(PostMessage postMessage);

}