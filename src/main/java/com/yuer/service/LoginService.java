package com.yuer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuer.dao.UserDao;
import com.yuer.model.UserMB;

@Service
public class LoginService {
	@Autowired
	private UserDao userDao;
	
	public void login(String loginName,String password){
		try {
			UserMB userMB = userDao.selectUserByLoginName(loginName);
			if(userMB == null){
				//账号不存在
			}
			String passwodmd5 = password;//对密码进行MD5加密
			if(!passwodmd5.equals(userMB.getPassword())){
				//密码错误
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
