package com.yuer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.yuer.model.param.UserParam;
import com.yuer.model.util.UserUtil;
import com.yuer.service.UserService;
import com.yuer.util.YuerUtils;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/userList",produces = YuerUtils.TEXT_HTML)
	public String userList(HttpServletRequest request,Model model,UserParam userParam){
		UserUtil userUtil = (UserUtil) request.getSession().getAttribute(YuerUtils.SESSION_USER);
		String deptIds = (String) request.getSession().getAttribute(YuerUtils.SESSION_DEPTIDS);
		if(userUtil == null){
			return "";
		}
		userParam.setId(userUtil.getId());
		userParam.setDeptIds(deptIds);
		PageInfo<UserUtil> pageInfo = userService.selectUserInfo(userParam);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("userParam", userParam);
		return "user/yuer_user";
	}
	
	@RequestMapping(value = "/gotoUserAdd",produces = YuerUtils.TEXT_HTML)
	public String gotoUserAdd(HttpServletRequest request,Model model){
		
		return "user/yuer_user_add";
	}
	
	
}
