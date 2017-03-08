package com.yuer.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.yuer.dao.UserDao;
import com.yuer.model.UserMB;
import com.yuer.model.param.UserParam;
import com.yuer.model.util.UserUtil;
import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;
import com.yuer.util.YuerValueUtils;

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
		if(userMB.getId() == null){
			UserMB mb = userDao.selectUserByLoginName(userMB.getLoginName());
			if(mb != null){
				return 1;
			}
			userMB.setPassword("111111");
			userMB.setCreateTime(new Date());
			userDao.insertSelective(userMB);
		}else{
			UserMB mb = userDao.selectUserByLoginName(userMB.getLoginName());
			if(!mb.getId().equals(userMB.getId())){
				return 1;
			}
			userDao.updateByPrimaryKeySelective(userMB);
		}
		return 0;
	}
	
	public UserParam selectByPrimaryKey(Integer userId){
		UserParam param = new UserParam();
		try {
			UserMB mb = userDao.selectByPrimaryKey(userId);
			if(mb != null){
				param = UserParam.userMBToUserParam(mb);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return param;
		}
		return param;
	}
	
	public String deleteByPrimaryKey(Integer userId){
		UserMB mb = userDao.selectByPrimaryKey(userId);
		if(mb == null){
			return YuerJsonUtils.objToJson(new YResult("error", "用户不存在,刷新后重试"));
		}
		userDao.deleteByPrimaryKey(userId);
		return YuerJsonUtils.objToJson(new YResult());
	}
	
}
