package com.yuer.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuer.dao.MenuDao;
import com.yuer.dao.UserDao;
import com.yuer.model.MenuMB;
import com.yuer.model.UserMB;
import com.yuer.model.util.MenuUtil;
import com.yuer.model.util.UserUtil;
import com.yuer.util.YuerUtils;

@Service
public class LoginService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private MenuDao menuDao;
	
	public String login(HttpServletRequest request,String loginName,String password){
		try {
			UserMB userMB = userDao.selectUserByLoginName(loginName);
			//账号不存在
			if(userMB == null){
				return YuerUtils.USER_EMPTY_CODE;
			}
			String passwodmd5 = password;//对密码进行MD5加密
			//密码错误
			if(!passwodmd5.equals(userMB.getPassword())){
				return YuerUtils.PWD_ERROR_CODE;
			}
			//用户详情
			UserUtil userUtil = userDao.selectUserInfoById(userMB.getId());
			//菜单信息
			List<MenuMB> menuMBs = menuDao.selectMenusByRoleId(userMB.getRoleId());
			
			request.getSession().setAttribute(YuerUtils.SESSION_USER, userUtil);
			request.getSession().setAttribute(YuerUtils.SESSION_MENUS, getMenuSort(menuMBs));
			//修改最后登录时间
			userDao.updateUserLastLoginTime(userMB.getId());
			
			return YuerUtils.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return YuerUtils.ERROR;
		}
	}
	
	/**
	 * 对菜单进行层级分类
	 * @param menuMBs
	 * @return
	 */
	private List<MenuUtil> getMenuSort(List<MenuMB> menuMBs){
		List<MenuUtil> list = new ArrayList<>();
		for(MenuMB menuMB : menuMBs){
			MenuUtil menuUtil = new MenuUtil();
			menuUtil.setId(menuMB.getId());
			menuUtil.setName(menuMB.getName());
			menuUtil.setCode(menuMB.getCode());
			menuUtil.setParentId(menuMB.getParentId());
			menuUtil.setUrl(menuMB.getUrl());
			
			if(menuMB.getParentId() == 0){
				list.add(menuUtil);
			}else{
				for(MenuUtil util : list){
					if(menuMB.getParentId() == util.getId()){
						util.getChildMenus().add(menuUtil);
						break;
					}
				}
			}
		}
		return list;
	}
	
	
}
