package com.example.offer.mapper;

import com.example.offer.model.EnterpriseMessage;
import com.example.offer.model.EnterpriseMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseMessageMapper {
    long countByExample(EnterpriseMessageExample example);

    int deleteByExample(EnterpriseMessageExample example);

    int deleteByPrimaryKey(Integer enterid);

    int insert(EnterpriseMessage record);

    int insertSelective(EnterpriseMessage record);

    List<EnterpriseMessage> selectByExample(EnterpriseMessageExample example);

    EnterpriseMessage selectByPrimaryKey(Integer enterid);

    int updateByExampleSelective(@Param("record") EnterpriseMessage record, @Param("example") EnterpriseMessageExample example);

    int updateByExample(@Param("record") EnterpriseMessage record, @Param("example") EnterpriseMessageExample example);

    int updateByPrimaryKeySelective(EnterpriseMessage record);

    int updateByPrimaryKey(EnterpriseMessage record);
}