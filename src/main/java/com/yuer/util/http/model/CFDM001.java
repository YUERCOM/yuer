package com.yuer.util.http.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include=Inclusion.NON_NULL)
public class CFDM001 {
	@JsonProperty("deCode")
	private String deId;//设备标识
	@JsonProperty("deName")
	private String deName;//设备名称
	@JsonProperty("deType")
	private String deType;//设备类型
	@JsonProperty("deVersion")
	private String deVersion;//设备版本
	@JsonProperty("deFactory")
	private String deVendor;//设备厂商
	@JsonProperty("DE_ALARM_STATE")
	private String deAlarmState;//设备告警状态
	public String getDeId() {
		return deId;
	}
	public void setDeId(String deId) {
		this.deId = deId;
	}
	public String getDeName() {
		return deName;
	}
	public void setDeName(String deName) {
		this.deName = deName;
	}
	public String getDeType() {
		return deType;
	}
	public void setDeType(String deType) {
		this.deType = deType;
	}
	public String getDeVendor() {
		return deVendor;
	}
	public void setDeVendor(String deVendor) {
		this.deVendor = deVendor;
	}
	public String getDeAlarmState() {
		return deAlarmState;
	}
	public void setDeAlarmState(String deAlarmState) {
		this.deAlarmState = deAlarmState;
	}
	public String getDeVersion() {
		return deVersion;
	}
	public void setDeVersion(String deVersion) {
		this.deVersion = deVersion;
	}
	
	
}
