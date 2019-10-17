package com.example.offer.mapper;

import com.example.offer.model.InterSkill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InterSkillMapper {

    List<InterSkill> findAll();

    InterSkill selectByPrimaryKey(int interSkillId);

    int deleteByPrimaryKey(int interSkillId);

    List<InterSkill> seacher(String str);


}
