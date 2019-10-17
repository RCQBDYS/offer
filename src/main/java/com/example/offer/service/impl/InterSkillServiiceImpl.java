package com.example.offer.service.impl;

import com.example.offer.mapper.InterSkillMapper;
import com.example.offer.model.InterSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InterSkillServiiceImpl{

    @Autowired
    private InterSkillMapper interSkillMapper;

   public  List<InterSkill> findAll(){
        return  interSkillMapper.findAll();
    }

   public InterSkill selectByPrimaryKey(int interSkillId){
        return  interSkillMapper.selectByPrimaryKey(interSkillId);
    }

   public  int deleteByPrimaryKey(int interSkillId){
        return interSkillMapper.deleteByPrimaryKey(interSkillId);
    }

   public  List<InterSkill> seacher(String str){
        return  interSkillMapper.seacher(str);
    }
}
