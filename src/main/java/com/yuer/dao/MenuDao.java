package com.yuer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuer.mapper.MenuMBMapper;
import com.yuer.model.MenuMB;

@Repository
public class MenuDao {
	
	@Autowired
	private MenuMBMapper menuMBMapper;
	
	public List<MenuMB> selectMenusByRoleId(Integer roleId){
		return menuMBMapper.selectMenusByRoleId(roleId);
	}
	
	
}
