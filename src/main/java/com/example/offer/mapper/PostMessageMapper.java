package com.example.offer.mapper;

import com.example.offer.model.PostMessage;
import com.example.offer.model.PostMessageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostMessageMapper {

    List<PostMessage> listAll();

}