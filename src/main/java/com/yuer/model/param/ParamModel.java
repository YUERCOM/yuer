package com.yuer.model.param;

public class ParamModel {
	private Integer pageNum = 1;			//页码
	private Integer numPerPage = 20;		//每页显示大小
	private Boolean isExport = false;		//是否是导出   false表示分页查询    true表示导出数据
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
	public Boolean getIsExport() {
		return isExport;
	}
	public void setIsExport(Boolean isExport) {
		this.isExport = isExport;
	}
}
