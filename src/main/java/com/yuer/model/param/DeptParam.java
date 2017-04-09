package com.yuer.model.param;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeptParam extends ParamModel {
	private static final Logger logger = LoggerFactory.getLogger(DeptParam.class);
	
	private Integer id;
    private String name;
    private String deptDesc;
    private String createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
    
    
    
    
}
