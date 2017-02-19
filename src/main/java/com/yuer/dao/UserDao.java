package com.yuer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuer.mapper.UserMBMapper;
import com.yuer.model.UserMB;

@Repository
public class UserDao {
	@Autowired
	private UserMBMapper userMBMapper;
	
	public UserMB selectUserByLoginName(String loginName){
		UserMB userMB = userMBMapper.selectUserByLoginName(loginName);
		return userMB;
	}

}
