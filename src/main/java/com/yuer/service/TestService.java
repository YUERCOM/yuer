package com.yuer.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.yuer.dao.TestDao;
import com.yuer.model.Test;

@Service
public class TestService {
	@Autowired
	private TestDao testDao;
	
	
	public Test abc(){
		return testDao.abc();
	}
	
	public PageInfo<Test> testlist(int pageNum,int pageSize){
		PageInfo<Test> pageInfo = testDao.testlist(pageNum, pageSize);
		return pageInfo;
	}
	
	public List<Test> testlist1(){
		List<Test> list = testDao.testlist1();
		return list;
	}
}
