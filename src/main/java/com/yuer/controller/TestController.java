package com.yuer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuer.model.Test;
import com.yuer.service.TestService;

@RequestMapping(value="/test")
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/abc",method=RequestMethod.GET)
	public void abc(){
		Test test = testService.abc();
		System.out.println(test.getName());
	}
	
}
