package com.like.dao;

import com.like.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from user where userId = #{userId}")
    User findUserByUserid(@Param("userId") String userId);

    @Insert("insert into user (userId, pwd) values (#{userId},#{pwd})")
    boolean insertUsers (@Param("userId") String userId,@Param("pwd") String pwd);
}