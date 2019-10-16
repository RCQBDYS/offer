package com.example.offer.mapper;

import com.example.offer.model.ProjectExperience;
import com.example.offer.model.ProjectExperienceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProjectExperienceMapper {
    long countByExample(ProjectExperienceExample example);

    int deleteByExample(ProjectExperienceExample example);

    int deleteByPrimaryKey(Integer projectid);

    int insert(ProjectExperience record);

    int insertSelective(ProjectExperience record);

    List<ProjectExperience> selectByExample(ProjectExperienceExample example);

    List<ProjectExperience> selectByUserName(String username);

    ProjectExperience selectByPrimaryKey(Integer projectid);

    int updateByExampleSelective(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByExample(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    int updateByPrimaryKeySelective(ProjectExperience record);

    int updateByPrimaryKey(ProjectExperience record);
}