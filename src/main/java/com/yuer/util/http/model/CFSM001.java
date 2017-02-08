package com.yuer.util.http.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include=Inclusion.NON_NULL)
public class CFSM001 {
	@JsonProperty("SUID")
	private String suId;//检测点标识
	@JsonProperty("SU_PARENT_ID")
	private String suParentId;//父资源标识
	@JsonProperty("SU_PARENT_TYPE")
	private String suParentType;//父资源类型
	@JsonProperty("SU_NAME")
	private String suName;//监测点名称
	@JsonProperty("SU_SN")
	private String suSn;//监测点序号
	@JsonProperty("SU_TYPE")
	private String suType;//监测点类型
	@JsonProperty("SU_SERVER_STATE")
	private String suServerState;//监测点服务状态
	@JsonProperty("SU_UNIT")
	private String suUnit;//遥测单位
	@JsonProperty("SU_QUANTITY")
	private Integer suQuantity;
	public String getSuId() {
		return suId;
	}
	public void setSuId(String suId) {
		this.suId = suId;
	}
	public String getSuParentId() {
		return suParentId;
	}
	public void setSuParentId(String suParentId) {
		this.suParentId = suParentId;
	}
	public String getSuParentType() {
		return suParentType;
	}
	public void setSuParentType(String suParentType) {
		this.suParentType = suParentType;
	}
	public String getSuName() {
		return suName;
	}
	public void setSuName(String suName) {
		this.suName = suName;
	}
	public String getSuSn() {
		return suSn;
	}
	public void setSuSn(String suSn) {
		this.suSn = suSn;
	}
	public String getSuType() {
		return suType;
	}
	public void setSuType(String suType) {
		this.suType = suType;
	}
	public String getSuServerState() {
		return suServerState;
	}
	public void setSuServerState(String suServerState) {
		this.suServerState = suServerState;
	}
	public String getSuUnit() {
		return suUnit;
	}
	public void setSuUnit(String suUnit) {
		this.suUnit = suUnit;
	}
	public Integer getSuQuantity() {
		return suQuantity;
	}
	public void setSuQuantity(Integer suQuantity) {
		this.suQuantity = suQuantity;
	}
	
}
