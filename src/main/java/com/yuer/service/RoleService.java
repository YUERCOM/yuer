package com.yuer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuer.dao.RoleDao;
import com.yuer.model.RoleMB;

@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public List<RoleMB> selectRoleInfos(){
		return roleDao.selectRoleInfos();
	}
}
