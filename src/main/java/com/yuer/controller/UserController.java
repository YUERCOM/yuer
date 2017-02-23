package com.yuer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuer.util.YuerUtils;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping(value = "/userList",method=RequestMethod.GET,produces = YuerUtils.TEXT_HTML)
	public String userList(){
		System.out.println("111111111");
		return "user/yuer_user";
	}
	
}
