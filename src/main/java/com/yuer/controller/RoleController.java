package com.yuer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yuer.model.RoleMB;
import com.yuer.service.RoleService;
import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;

@Controller
@RequestMapping(value = "/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value = "/getRoleList",method=RequestMethod.GET,produces = YuerUtils.TEXT_HTML)
	public @ResponseBody String getRoleList(){
		List<RoleMB> list = roleService.selectRoleInfos();
		return YuerJsonUtils.objToJson(new YResult(list));
	}
}
