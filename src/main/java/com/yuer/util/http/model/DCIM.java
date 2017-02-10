package com.yuer.util.http.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class DCIM {
	
//	@JsonProperty("SUCCESS")
	@JsonProperty("success")
	private boolean success = true;
//	@JsonProperty("ERRORCODE")
	@JsonProperty("errorcode")
	private String errorcode = "";
	
	public DCIM(){
		
	}
	public DCIM(boolean success){
		this.success = success;
	}
	public DCIM(boolean success,String errorcode) {
		this.success = success;
		this.errorcode = errorcode;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	
	
}
