package com.yuer.util.http.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include=Inclusion.NON_NULL)
public class CFNM001{
	@JsonProperty("NM_NAME")
	private String nmName;				//网管名称
	@JsonProperty("NM_TYPE")
	private String nmType;				//网管类型
	@JsonProperty("NM_VERSION")
	private String nmVersion;			//网管版本
	@JsonProperty("NM_VENDOR")
	private String nmVendor;			//生产厂商（NARI）
	@JsonProperty("NM_YGSBSL")
	private Integer nmYgsbsl;			//网管管理设备数量
	@JsonProperty("NM_KGSBSL")
	private Integer nmKgsbsl;			//网管可管设备数量
	
	public String getNmName() {
		return nmName;
	}
	public void setNmName(String nmName) {
		this.nmName = nmName;
	}
	public String getNmType() {
		return nmType;
	}
	public void setNmType(String nmType) {
		this.nmType = nmType;
	}
	public String getNmVersion() {
		return nmVersion;
	}
	public void setNmVersion(String nmVersion) {
		this.nmVersion = nmVersion;
	}
	public String getNmVendor() {
		return nmVendor;
	}
	public void setNmVendor(String nmVendor) {
		this.nmVendor = nmVendor;
	}
	public Integer getNmYgsbsl() {
		return nmYgsbsl;
	}
	public void setNmYgsbsl(Integer nmYgsbsl) {
		this.nmYgsbsl = nmYgsbsl;
	}
	public Integer getNmKgsbsl() {
		return nmKgsbsl;
	}
	public void setNmKgsbsl(Integer nmKgsbsl) {
		this.nmKgsbsl = nmKgsbsl;
	}
	
}
