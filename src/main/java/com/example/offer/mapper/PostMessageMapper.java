package com.example.offer.mapper;

import com.example.offer.model.PostMessage;
import com.example.offer.model.PostMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMessageMapper {
    long countByExample(PostMessageExample example);

    int deleteByExample(PostMessageExample example);

    int deleteByPrimaryKey(Integer postid);

    int insert(PostMessage record);

    int insertSelective(PostMessage record);

    List<PostMessage> selectByExample(PostMessageExample example);

    PostMessage selectByPrimaryKey(Integer postid);

    int updateByExampleSelective(@Param("record") PostMessage record, @Param("example") PostMessageExample example);

    int updateByExample(@Param("record") PostMessage record, @Param("example") PostMessageExample example);

    int updateByPrimaryKeySelective(PostMessage record);

    int updateByPrimaryKey(PostMessage record);
}