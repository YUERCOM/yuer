package com.yuer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuer.dao.TestMapper;
import com.yuer.model.Test;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	
	
	public Test abc(){
		return testMapper.abc();
	}
}
