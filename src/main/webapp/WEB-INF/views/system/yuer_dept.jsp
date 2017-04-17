<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	var staticRoot = "${staticRoot}";
	var rootPath = "${rootPath}";
</script>
<script type="text/javascript" src="${staticRoot}/static/js/system/yuer_dept.js"></script>
<div class="accountInfo">
	<form id="pagerForm" method="POST" action="${rootPath}/dept/deptPageInfo">
		<input type="hidden" name="pageNum" value="${pageInfo.pageNum }" />
		<input type="hidden" name="numPerPage" value="${pageInfo.pageSize }" />
		<input type="hidden" name="name" value="${deptParam.name }" />
	</form>
	<form id="" onsubmit="return navTabSearch(this);" method="POST" action="${rootPath}/dept/deptPageInfo">
		<div class="searchBar" style="margin-top:18px;">
			<table class="searchContent">
				<tr>
					<td>
						部门名称：<input type="text" name="name" value="${deptParam.name }" />
					</td>
					<td>
						<div class="buttonActive"><div class="buttonContent"><button type="submit">查  询</button></div></div>
					</td>
				</tr>
			</table>
		</div>
	</form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<!-- <li><span>添加无权限</span></li> -->
			<li><a class="add" href="${rootPath}/user/gotoUserAdd" target="dialog" rel="yuer_dept_add" width="400" height="370" fresh="true" mask="true"><span>添加</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="10%" align="center">部门ID</th>
				<th width="10%" align="center">部门名称</th>
				<th width="55%" align="center">部门描述</th>
				<th width="15%" align="center">创建时间</th>
				<th width="10%" align="center">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pageInfo.list}" var="dept">
				<tr target="${dept.id }" rel="${dept.id }">
					<td>${dept.id }</td>
					<td>${dept.name }</td>
					<td>${dept.deptDesc }</td>
					<td>${dept.createTime }</td>
					<td>
						<a title="删除" href="javascript:void(0)" onclick="deleteDept(${dept.id})" class="btnDel">删除</a>
						<a title="编辑" class="btnEdit" target="dialog" href="${rootPath}/dept/gotoDeptUpdate/${dept.id }" rel="yuer_dept_update" width="400" height="370" fresh="true" mask="true">编辑</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<c:if test="${pageInfo.pageSize == 20 }">
					<option value="20" selected="selected">20</option>
					<option value="50">50</option>
					<option value="100">100</option>
				</c:if>
				<c:if test="${pageInfo.pageSize == 50 }">
					<option value="20">20</option>
					<option value="50" selected="selected">50</option>
					<option value="100">100</option>
				</c:if>
				<c:if test="${pageInfo.pageSize == 100 }">
					<option value="20">20</option>
					<option value="50">50</option>
					<option value="100" selected="selected">100</option>
				</c:if>
			</select>
			<span>条，共 ${pageInfo.total } 条</span>
		</div>
		<div class="pagination" targetType="navTab" totalCount="${pageInfo.total }" numPerPage="${pageInfo.pageSize }" pageNumShown="10" currentPage="${pageInfo.pageNum }"></div>
	</div>
</div>

