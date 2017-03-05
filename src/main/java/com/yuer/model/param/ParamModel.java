package com.yuer.model.param;

public class ParamModel {
	private Integer pageNum = 1;			//页码
	private Integer numPerPage = 20;		//每页显示大小
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}
}
