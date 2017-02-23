package com.yuer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuer.model.UserMB;
import com.yuer.service.LoginService;
import com.yuer.spring.aspect.authuser.AuthUser;
import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * 用户登录
	 * @param request
	 * @param userMB
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String login(HttpServletRequest request, UserMB userMB){
		String result = loginService.login(request, userMB.getLoginName(), userMB.getPassword());
		if(result.equals(YuerUtils.SUCCESS)){
			return YuerJsonUtils.objToJson(new YResult());
		}
		if(result.equals(YuerUtils.USER_EMPTY_CODE)){
			return YuerJsonUtils.objToJson(new YResult("error", YuerUtils.USER_EMPTY_STR));
		}
		if(result.equals(YuerUtils.PWD_ERROR_CODE)){
			return YuerJsonUtils.objToJson(new YResult("error", YuerUtils.PWD_ERROR_STR));
		}
		return YuerJsonUtils.objToJson(new YResult("error", YuerUtils.ERROR_STR));
	}
	
	/**
	 * 进入主页
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/home",method=RequestMethod.GET,produces = YuerUtils.TEXT_HTML)
	public String home(HttpServletRequest request,Model model){
		model.addAttribute("user",request.getSession().getAttribute(YuerUtils.SESSION_USER));
		model.addAttribute("menus", request.getSession().getAttribute(YuerUtils.SESSION_MENUS));
		return "home";
	}
	
	
	
}
