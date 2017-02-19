package com.yuer.mapper;

import com.yuer.model.DeptMB;

public interface DeptMBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeptMB record);

    int insertSelective(DeptMB record);

    DeptMB selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeptMB record);

    int updateByPrimaryKey(DeptMB record);
}