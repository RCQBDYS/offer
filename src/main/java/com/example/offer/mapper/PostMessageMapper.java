package com.example.offer.mapper;

import com.example.offer.model.PostMessage;
import com.example.offer.model.PostMessageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostMessageMapper {

    List<PostMessage> listAll(Long userId);

    List<PostMessage> postList();

    List<PostMessage> queryByKeyword(@Param(value="keyword") String keyword,Long userId);

    PostMessage oneMessage(Long postId);

    int update(PostMessage postMessage);

    int delete(Long postId);

    int  save(PostMessage postMessage);

    List<PostMessage> search(@Param(value = "keyword") String keyword);

    int postPut(int postId);

    List<PostMessage> selectPut(Long userId);

    List<PostMessage> searchPut(String keyword,Long userId);

    List<PostMessage> findAllPost();
}