package com.yuer.mapper;

import com.yuer.model.MenuMB;

public interface MenuMBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuMB record);

    int insertSelective(MenuMB record);

    MenuMB selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuMB record);

    int updateByPrimaryKey(MenuMB record);
}