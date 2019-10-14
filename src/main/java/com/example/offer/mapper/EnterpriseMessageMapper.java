package com.example.offer.mapper;

import com.example.offer.model.EnterpriseMessage;
import com.example.offer.model.EnterpriseMessageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EnterpriseMessageMapper {

    EnterpriseMessage selectUserId(Long userId);

    int update(EnterpriseMessage enterpriseMessage);

}