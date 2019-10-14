package com.example.offer.service.impl;


import com.example.offer.mapper.ProjectExperienceMapper;
import com.example.offer.model.ProjectExperience;
import com.example.offer.model.WorkExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectExperienceImpl {

    @Autowired
    private ProjectExperienceMapper projectExperienceMapper;
    public int insert(ProjectExperience record){
        return  projectExperienceMapper.insert(record);
    }

    public List<ProjectExperience> SelectByUserName(String username){

        return projectExperienceMapper.selectByUserName(username);
    }

    public int deleteByPrimaryKey(Integer projectId) {
        return projectExperienceMapper.deleteByPrimaryKey(projectId);
    }

    public  ProjectExperience selectByPrimaryKey(Integer projectId){
        return projectExperienceMapper.selectByPrimaryKey(projectId);
    }

    public  int updateByPrimaryKey(ProjectExperience projectExperience){
        return projectExperienceMapper.updateByPrimaryKey(projectExperience);
    }

}
