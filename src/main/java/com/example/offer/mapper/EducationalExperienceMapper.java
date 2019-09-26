package com.example.offer.mapper;

import com.example.offer.model.EducationalExperience;
import com.example.offer.model.EducationalExperienceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EducationalExperienceMapper {
    long countByExample(EducationalExperienceExample example);

    int deleteByExample(EducationalExperienceExample example);

    int deleteByPrimaryKey(Integer eduid);

    int insert(EducationalExperience record);

    int insertSelective(EducationalExperience record);

    List<EducationalExperience> selectByExample(EducationalExperienceExample example);

    EducationalExperience selectByPrimaryKey(Integer eduid);

    int updateByExampleSelective(@Param("record") EducationalExperience record, @Param("example") EducationalExperienceExample example);

    int updateByExample(@Param("record") EducationalExperience record, @Param("example") EducationalExperienceExample example);

    int updateByPrimaryKeySelective(EducationalExperience record);

    int updateByPrimaryKey(EducationalExperience record);
}