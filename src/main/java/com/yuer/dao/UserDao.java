package com.yuer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuer.mapper.UserMBMapper;
import com.yuer.model.UserMB;
import com.yuer.model.util.UserUtil;

@Repository
public class UserDao {
	@Autowired
	private UserMBMapper userMBMapper;
	
	public UserMB selectUserByLoginName(String loginName){
		UserMB userMB = userMBMapper.selectUserByLoginName(loginName);
		return userMB;
	}
	
	public UserUtil selectUserInfoById(Integer userId){
		return userMBMapper.selectUserInfoById(userId);
	}
	
	public void updateUserLastLoginTime(Integer userId){
		userMBMapper.updateUserLastLoginTime(userId);
	}

}
