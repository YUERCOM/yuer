package com.yuer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuer.mapper.DeptMBMapper;
import com.yuer.model.DeptMB;

@Repository
public class DeptDao {
	@Autowired
	private DeptMBMapper deptMBMapper;
	
	public List<DeptMB> selectDeptInfoByIds(String deptIds){
		return deptMBMapper.selectDeptInfoByIds(deptIds);
	}
}
