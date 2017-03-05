package com.yuer.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.yuer.dao.UserDao;
import com.yuer.model.UserMB;
import com.yuer.model.param.UserParam;
import com.yuer.model.util.UserUtil;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public PageInfo<UserUtil> selectUserInfo(UserParam userParam){
		PageInfo<UserUtil> pageInfo = userDao.selectUserInfo(userParam);
		if(pageInfo != null){
			for(UserUtil userUtil : pageInfo.getList()){
				if("0".equals(userUtil.getSex())){
					userUtil.setSex("女");
				}else{
					userUtil.setSex("男");
				}
			}
		}
		return pageInfo;
	}
	
	public int insertSelective(UserMB userMB){
		UserMB mb = userDao.selectUserByLoginName(userMB.getLoginName());
		if(mb != null){
			return 1;
		}
		userMB.setPassword("111111");
		userMB.setCreateTime(new Date());
		userDao.insertSelective(userMB);
		return 0;
	}
	
}
