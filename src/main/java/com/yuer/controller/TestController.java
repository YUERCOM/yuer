package com.yuer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yuer.model.Test;
import com.yuer.service.TestService;
import com.yuer.spring.aspect.authuser.AuthUser;
import com.yuer.util.MD5;
import com.yuer.util.YResult;
import com.yuer.util.YuerCoreUtils;
import com.yuer.util.YuerJsonUtils;
import com.yuer.util.YuerUtils;

@RequestMapping(value="/test")
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@AuthUser
	@RequestMapping(value="/abc",method=RequestMethod.GET)
	public @ResponseBody String abc(){
//		Test test = testService.abc();
//		System.out.println(test.getName());
		YuerCoreUtils.getProperty("email.linlei");
		return YuerCoreUtils.getProperty("email.linlei");
	}
	
	
	@RequestMapping(value="/testlist",method=RequestMethod.GET,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String testlist(){
		PageInfo<Test> testlist = testService.testlist(1,5);
		return YuerJsonUtils.objToJson(new YResult(testlist));
	}

	@RequestMapping(value="/testlist1",method=RequestMethod.GET,produces = YuerUtils.APPLICATION_JSON)
	public @ResponseBody String testlist1(){
		List<Test> testlist = testService.testlist1();
		return YuerJsonUtils.objToJson(new YResult(testlist));
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET,produces = YuerUtils.APPLICATION_JSON)
	public String index(){
		return "index";
	}
	
	public static void main(String[] args) {
//		Test test = new Test();
//		test.setId(1);
//		test.setName("张三");
//		test.setSex(20);
//		String testJson = YuerJsonUtils.objToJson(test);
//		System.out.println(testJson);
//		
//		Test test2 = YuerJsonUtils.jsonToObj(testJson, Test.class);
//		System.out.println(test2.getName());
		
		System.out.println(MD5.calculate("nicai_1128"));
		
		
		
		
		
	}
	
	
}
