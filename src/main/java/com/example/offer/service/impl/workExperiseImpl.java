package com.example.offer.service.impl;

import com.example.offer.mapper.WorkExperienceMapper;
import com.example.offer.model.WorkExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class workExperiseImpl {

    @Autowired
    private WorkExperienceMapper workExperienceMapper;
    public int insert(WorkExperience record){

        return  workExperienceMapper.insert(record);
    }
}
