package com.yuer.util.http.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class AM009{
	@JsonProperty("ALID")
	private String alId;//告警流水号
	@JsonProperty("AL_OBJ_TYPE")
	private String alObjType;//告警对象类型
	@JsonProperty("AL_OBJ_ID")
	private String alObjId;//告警对象标识
	@JsonProperty("AL_CAUSE")
	private String alCause;//告警原因
	@JsonProperty("AL_LEVEL")
	private String alLevel;//告警级别
	@JsonProperty("AL_TYPE")
	private String alType;//告警类型
	@JsonProperty("AL_CREATE_TIME")
	private String alCreateTime;//告警产生时间
	@JsonProperty("AL_DESC")
	private String alDesc;//告警描述
	public String getAlId() {
		return alId;
	}
	public void setAlId(String alId) {
		this.alId = alId;
	}
	public String getAlObjType() {
		return alObjType;
	}
	public void setAlObjType(String alObjType) {
		this.alObjType = alObjType;
	}
	public String getAlObjId() {
		return alObjId;
	}
	public void setAlObjId(String alObjId) {
		this.alObjId = alObjId;
	}
	public String getAlCause() {
		return alCause;
	}
	public void setAlCause(String alCause) {
		this.alCause = alCause;
	}
	public String getAlLevel() {
		return alLevel;
	}
	public void setAlLevel(String alLevel) {
		this.alLevel = alLevel;
	}
	public String getAlCreateTime() {
		return alCreateTime;
	}
	public void setAlCreateTime(String alCreateTime) {
		this.alCreateTime = alCreateTime;
	}
	public String getAlDesc() {
		return alDesc;
	}
	public void setAlDesc(String alDesc) {
		this.alDesc = alDesc;
	}
	public String getAlType() {
		return alType;
	}
	public void setAlType(String alType) {
		this.alType = alType;
	}
	
	
}
