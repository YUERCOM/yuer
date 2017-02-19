package com.yuer.mapper;

import com.yuer.model.RoleMB;

public interface RoleMBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMB record);

    int insertSelective(RoleMB record);

    RoleMB selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMB record);

    int updateByPrimaryKey(RoleMB record);
}