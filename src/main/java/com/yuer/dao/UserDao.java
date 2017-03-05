package com.yuer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuer.mapper.UserMBMapper;
import com.yuer.model.UserMB;
import com.yuer.model.param.UserParam;
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
	
	public PageInfo<UserUtil> selectUserInfo(UserParam userParam){
		PageHelper.startPage(userParam.getPageNum(), userParam.getNumPerPage());
		List<UserUtil> list = userMBMapper.selectUserInfo(userParam);
		return new PageInfo<UserUtil>(list);
	}
	
	public void insertSelective(UserMB userMB){
		userMBMapper.insertSelective(userMB);
	}

}
