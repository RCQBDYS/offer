package com.example.offer.mapper;

import com.example.offer.model.Admin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {

    int deleteByPrimaryKey(Integer adminid);

    /*查找数据库中是否存在改用户*/
    @Select("SELECT * FROM admin WHERE adminName = #{adminName} AND adminPassword=#{adminPassword}")
    Admin login(@Param("adminName") String adminName,@Param("adminPassword") String adminPassword);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer adminid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}