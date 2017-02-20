package com.yuer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuer.model.UserMB;
import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.POST,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String login(HttpServletRequest request, UserMB userMB){
		System.out.println("11111111");
		System.out.println(userMB.getLoginName());
//		System.out.println(json);
		return YuerJsonUtils.objToJson(new YResult("bbbbb"));
	}
	
}
