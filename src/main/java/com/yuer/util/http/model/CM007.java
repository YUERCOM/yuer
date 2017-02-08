package com.yuer.util.http.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include=Inclusion.NON_NULL)
public class CM007 {
	@JsonProperty("SUID")
	private String suId;//监测点标识
	@JsonProperty("DEID")
	private String deId;//设备标识
	@JsonProperty("PM_TYPE")
	private String pmType;//性能监测点类型
	@JsonProperty("PM_PARAM_NAME")
	private String pmParamName;//性能监测参数名称
	@JsonProperty("PM_PARAM_UNIT")
	private String pmParamUnit;//性能监测参数单位
	@JsonProperty("PM_PARAM_VALUE")
	private String pmParamValue;//性能监测参数值
	@JsonProperty("PM_TIME")
	private String pmTime;//性能监测时间，格式：YYYY-MM-DD HH:MM:SS
	@JsonProperty("PM_PERIOD")
	private String pmPeriod;//性能监测周期
	@JsonProperty("PM_LOCATION")
	private String pmLocation;//性能监测位置
	public String getDeId() {
		return deId;
	}
	public void setDeId(String deId) {
		this.deId = deId;
	}
	public String getPmType() {
		return pmType;
	}
	public void setPmType(String pmType) {
		this.pmType = pmType;
	}
	public String getPmParamName() {
		return pmParamName;
	}
	public void setPmParamName(String pmParamName) {
		this.pmParamName = pmParamName;
	}
	public String getPmParamUnit() {
		return pmParamUnit;
	}
	public void setPmParamUnit(String pmParamUnit) {
		this.pmParamUnit = pmParamUnit;
	}
	public String getPmParamValue() {
		return pmParamValue;
	}
	public void setPmParamValue(String pmParamValue) {
		this.pmParamValue = pmParamValue;
	}
	public String getPmTime() {
		return pmTime;
	}
	public void setPmTime(String pmTime) {
		this.pmTime = pmTime;
	}
	public String getPmPeriod() {
		return pmPeriod;
	}
	public void setPmPeriod(String pmPeriod) {
		this.pmPeriod = pmPeriod;
	}
	public String getPmLocation() {
		return pmLocation;
	}
	public void setPmLocation(String pmLocation) {
		this.pmLocation = pmLocation;
	}
	public String getSuId() {
		return suId;
	}
	public void setSuId(String suId) {
		this.suId = suId;
	}
	
}
