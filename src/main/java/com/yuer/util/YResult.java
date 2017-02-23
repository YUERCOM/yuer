package com.yuer.util;

import java.util.HashMap;

public class YResult {
	
	private String status = "success";				//返回状态   可以在YuerType中取值
	private Object result = new HashMap<>();		//返回的数据
	
	public YResult(){
		
	}
	
	public YResult(Object result){
		this.result = result;
	}
	
	public YResult(String status,Object result){
		this.status = status;
		this.result = result;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
