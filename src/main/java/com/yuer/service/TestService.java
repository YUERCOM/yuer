package com.yuer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuer.dao.TestMapper;
import com.yuer.model.Test;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	
	
	public Test abc(){
		return testMapper.abc();
	}
	
	public PageInfo<Test> testlist(){
		PageHelper.startPage(2, 5);
		List<Test> list = testMapper.testlist();
		return new PageInfo<Test>(list);
	}
}
