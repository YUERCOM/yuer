package com.yuer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuer.mapper.TestMapper;
import com.yuer.model.Test;

@Repository
public class TestDao {
	@Autowired
	private TestMapper testMapper;
	
	public Test abc(){
		return testMapper.abc();
	}
	
	/**
	 * 分页查询
	 * @param pageNum 页码
	 * @param pageSize 每页显示数量
	 * @return
	 */
	public PageInfo<Test> testlist(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Test> list = testMapper.testlist();
		return new PageInfo<Test>(list);
	}
	
	public List<Test> testlist1(){
		List<Test> list = testMapper.testlist();
		return list;
	}
	
}
