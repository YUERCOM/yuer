package com.yuer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuer.mapper.DeptMBMapper;
import com.yuer.model.DeptMB;
import com.yuer.model.param.DeptParam;
import com.yuer.model.util.DeptUtil;

@Repository
public class DeptDao {
	@Autowired
	private DeptMBMapper deptMBMapper;
	
	public List<DeptMB> selectDeptInfos(){
		return deptMBMapper.selectDeptInfos();
	}
	
	public PageInfo<DeptUtil> deptPageInfo(DeptParam param){
		if(!param.getIsExport()){
			PageHelper.startPage(param.getPageNum(), param.getNumPerPage());
		}
		List<DeptUtil> list = deptMBMapper.deptPageInfo(param);
		return new PageInfo<DeptUtil>(list);
	}
}
