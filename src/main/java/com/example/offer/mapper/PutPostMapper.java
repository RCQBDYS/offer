package com.example.offer.mapper;

import com.example.offer.model.PutPost;
import com.example.offer.model.PutPostExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PutPostMapper {
    long countByExample(PutPostExample example);

    int deleteByExample(PutPostExample example);

    int deleteByPrimaryKey(Integer putid);

    int insert(PutPost record);

    int insertSelective(PutPost record);

    List<PutPost> selectByExample(PutPostExample example);

    PutPost selectByPrimaryKey(Integer putid);

    int updateByExampleSelective(@Param("record") PutPost record, @Param("example") PutPostExample example);

    int updateByExample(@Param("record") PutPost record, @Param("example") PutPostExample example);

    int updateByPrimaryKeySelective(PutPost record);

    int updateByPrimaryKey(PutPost record);
}