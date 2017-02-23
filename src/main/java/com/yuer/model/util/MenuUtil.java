package com.yuer.model.util;

import java.util.ArrayList;
import java.util.List;

public class MenuUtil {
	
	private Integer id;			//ID
	private String name;		//菜单名称
	private String code;		//菜单编码
	private Integer parentId;	//菜单父ID
	private String url;			//菜单URL
	private List<MenuUtil> childMenus = new ArrayList<>();		//菜单子集合
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<MenuUtil> getChildMenus() {
		return childMenus;
	}
	public void setChildMenus(List<MenuUtil> childMenus) {
		this.childMenus = childMenus;
	}
	
	
}
