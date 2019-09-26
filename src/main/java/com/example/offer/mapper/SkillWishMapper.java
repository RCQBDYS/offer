package com.example.offer.mapper;

import com.example.offer.model.SkillWish;
import com.example.offer.model.SkillWishExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SkillWishMapper {
    long countByExample(SkillWishExample example);

    int deleteByExample(SkillWishExample example);

    int deleteByPrimaryKey(Integer swid);

    int insert(SkillWish record);

    int insertSelective(SkillWish record);

    List<SkillWish> selectByExample(SkillWishExample example);

    SkillWish selectByPrimaryKey(Integer swid);

    int updateByExampleSelective(@Param("record") SkillWish record, @Param("example") SkillWishExample example);

    int updateByExample(@Param("record") SkillWish record, @Param("example") SkillWishExample example);

    int updateByPrimaryKeySelective(SkillWish record);

    int updateByPrimaryKey(SkillWish record);
}