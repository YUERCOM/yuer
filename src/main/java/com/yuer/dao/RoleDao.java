package com.yuer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuer.mapper.RoleMBMapper;

@Repository
public class RoleDao {
	@Autowired
	private RoleMBMapper roleMBMapper;
	
	public List<Integer> selectDeptIdByRoleId(Integer roleId){
		return roleMBMapper.selectDeptIdByRoleId(roleId);
	}
}
