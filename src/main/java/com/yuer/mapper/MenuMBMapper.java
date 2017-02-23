package com.yuer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuer.model.MenuMB;

public interface MenuMBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuMB record);

    int insertSelective(MenuMB record);

    MenuMB selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuMB record);

    int updateByPrimaryKey(MenuMB record);
    
    List<MenuMB> selectMenusByRoleId(@Param("roleId")Integer roleId);
}