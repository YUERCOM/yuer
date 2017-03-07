package com.yuer.model.param;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yuer.model.UserMB;
import com.yuer.util.YuerJsonUtils;

public class UserParam extends ParamModel {
	
	private static final Logger logger = LoggerFactory.getLogger(YuerJsonUtils.class);
	
	private Integer id;
	private String deptIds;
	private String loginName;
	private String showName;
	private Integer sex;
	private Integer deptId;
	private String createTime;
	private String brithday;
	private String job;
	private Integer roleId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getDeptIds() {
		return deptIds;
	}
	public void setDeptIds(String deptIds) {
		this.deptIds = deptIds;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
	public static UserMB userParamToUserMB(UserParam param){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserMB userMB = new UserMB();
		try {
			userMB.setLoginName(param.getLoginName());
			userMB.setShowName(param.getShowName());
			userMB.setSex(param.getSex());
			if(param.getBrithday() != null){
				userMB.setBrithday(sdf.parse(param.getBrithday()));
			}
			userMB.setJob(param.getJob());
			userMB.setDeptId(param.getDeptId());
			userMB.setRoleId(param.getRoleId());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("UserParam.userParamToUserMB  UserParam转换为UserMB出错");
		}
		return userMB;
	}
	
	public static UserParam userMBToUserParam(UserMB mb){
		UserParam param = new UserParam();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			param.setId(mb.getId());
			param.setLoginName(mb.getLoginName());
			param.setShowName(mb.getShowName());
			param.setSex(mb.getSex());
			if(mb.getBrithday() != null){
				param.setBrithday(sdf.format(mb.getBrithday()));
			}
			param.setJob(mb.getJob());
			param.setDeptId(mb.getDeptId());
			param.setRoleId(mb.getRoleId());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("UserParam.userMBToUserParam  UserMB转换为UserParam出错");
		}
		return param;
	}
	
	
	
	
	
	
	
	
}
