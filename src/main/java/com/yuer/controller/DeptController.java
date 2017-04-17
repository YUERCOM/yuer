package com.yuer.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yuer.model.DeptMB;
import com.yuer.model.param.DeptParam;
import com.yuer.model.util.DeptUtil;
import com.yuer.service.DeptService;
import com.yuer.util.YResult;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;

@Controller
@RequestMapping(value = "/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/getDeptList",method=RequestMethod.GET,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String getDeptList(HttpServletRequest request){
		List<DeptMB> list = deptService.selectDeptInfos();
		return YuerJsonUtils.objToJson(new YResult(list));
	}
	
	@RequestMapping(value = "/deptPageInfo",produces = YuerUtils.TEXT_HTML)
	public String deptPageInfo(HttpServletRequest request,Model model,DeptParam param){
		PageInfo<DeptUtil> pageInfo = deptService.deptPageInfo(param);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("deptParam", param);
		return "system/yuer_dept";
	}
	
	
}
