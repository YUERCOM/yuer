package com.yuer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuer.util.YuerUtils;

@Controller
@RequestMapping(value = "/role")
public class RoleController {

	@RequestMapping(value = "/gotoRole",method=RequestMethod.GET,produces = YuerUtils.TEXT_HTML)
	public String gotoRole(){
		System.out.println("111111111");
		return "system/yuer_role";
	}
}