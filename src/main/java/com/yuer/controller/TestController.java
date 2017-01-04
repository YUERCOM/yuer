package com.yuer.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.yuer.model.Test;
import com.yuer.service.TestService;
import com.yuer.util.YuerCoreUtils;
import com.yuer.util.YuerJsonUtils;

@RequestMapping(value="/test")
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/abc",method=RequestMethod.GET)
	public @ResponseBody String abc(){
		Test test = testService.abc();
		System.out.println(test.getName());
		YuerCoreUtils.getProperty("email.linlei");
		return YuerCoreUtils.getProperty("email.linlei");
	}
	
	@RequestMapping(value="/testlist",method=RequestMethod.GET,produces = "application/json; charset=UTF-8")
	public @ResponseBody String testlist() throws JsonGenerationException, JsonMappingException, IOException{
		PageInfo<Test> testlist = testService.testlist();
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(testlist);
	}
	
	
	
	public static void main(String[] args) {
		Test test = new Test();
		test.setId(1);
		test.setName("张三");
		test.setSex(20);
		String testJson = YuerJsonUtils.objToJson(test);
		System.out.println(testJson);
		
		Test test2 = YuerJsonUtils.jsonToObj(testJson, Test.class);
		System.out.println(test2.getName());
		
		
		
		
		
	}
	
	
}
