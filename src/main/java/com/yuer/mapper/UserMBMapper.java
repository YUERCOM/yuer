package com.yuer.mapper;

import org.apache.ibatis.annotations.Param;

import com.yuer.model.UserMB;

public interface UserMBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMB record);

    int insertSelective(UserMB record);

    UserMB selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMB record);

    int updateByPrimaryKey(UserMB record);
    
    UserMB selectUserByLoginName(@Param("loginName")String loginName);
}