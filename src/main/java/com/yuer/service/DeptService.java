package com.yuer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuer.dao.DeptDao;
import com.yuer.model.DeptMB;

@Service
public class DeptService {
	@Autowired
	private DeptDao deptDao;
	
	public List<DeptMB> selectDeptInfoByIds(String deptIds){
		List<DeptMB> list = deptDao.selectDeptInfoByIds(deptIds);
		return list;
	}
	
}
