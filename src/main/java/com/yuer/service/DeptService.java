package com.yuer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.yuer.dao.DeptDao;
import com.yuer.model.DeptMB;
import com.yuer.model.param.DeptParam;
import com.yuer.model.util.DeptUtil;

@Service
public class DeptService {
	@Autowired
	private DeptDao deptDao;
	
	public List<DeptMB> selectDeptInfos(){
		List<DeptMB> list = deptDao.selectDeptInfos();
		return list;
	}
	
	public PageInfo<DeptUtil> deptPageInfo(DeptParam param){
		return deptDao.deptPageInfo(param);
	}
	
}
