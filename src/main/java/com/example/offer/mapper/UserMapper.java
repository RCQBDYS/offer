package com.example.offer.mapper;

import com.example.offer.model.User;
import com.example.offer.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

//    通过用户输入的用户和密码，在数据库中进行查找
    @Select("SELECT * FROM user WHERE userName = #{userName} and userPassword=#{userPassword} and userType=#{userType}")
    User login(@Param("userName") String userName,@Param("userPassword") String userPassword,@Param("userType") String userType);
    @Select("SELECT * FROM user WHERE userName = #{userName} ")
    User check(@Param("userName") String userName);
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}