package com.example.offer.service.impl;

import com.example.offer.mapper.WorkExperienceMapper;
import com.example.offer.model.WorkExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class workExperiseImpl {

    @Autowired
    private WorkExperienceMapper workExperienceMapper;
    public int insert(WorkExperience record){

        return  workExperienceMapper.insert(record);
    }

    public List<WorkExperience> selectByUserName(String userName){
        return workExperienceMapper.selectByUserName(userName);
    }

    public int deleteByPrimaryKey(int workid) {
        return  workExperienceMapper.deleteByPrimaryKey(workid);
    }

    public int updateByPrimaryKey(WorkExperience workExperience) {
        return  workExperienceMapper.updateByPrimaryKey(workExperience);
    }

    public WorkExperience selectByPrimaryKey(Integer workid){
        return  workExperienceMapper.selectByPrimaryKey(workid);
    }

}
