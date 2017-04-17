<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	var staticRoot="${staticRoot}";
	var rootPath = "${rootPath}";
</script>
<script type="text/javascript" src="${staticRoot}/static/js/system/yuer_user.js?v=0.05"></script>

<div class="accountInfo">
	<form id="pagerForm" method="POST" action="${rootPath}/user/userList">
		<input type="hidden" name="pageNum" value="${pageInfo.pageNum }" />
		<input type="hidden" name="numPerPage" value="${pageInfo.pageSize }" />
		<input type="hidden" name="loginName" value="${userParam.loginName }" />
		<input type="hidden" name="showName" value="${userParam.showName }" />
		<input type="hidden" id="hiddenSex" name="sex" value="${userParam.sex }" />
		<input type="hidden" id="hiddenDeptId" name="deptId" value="${userParam.deptId }" />
	</form>
	<form id="" onsubmit="return navTabSearch(this);" method="POST" action="${rootPath}/user/userList">
		<div class="searchBar" style="margin-top:18px;">
			<table class="searchContent">
				<tr>
					<td>
						登录名：<input type="text" name="loginName" value="${userParam.loginName }" />
					</td>
					<td>
						显示名：<input type="text" name="showName" value="${userParam.showName }" />
					</td>
					<td>
						<select id="searchSex" name="sex" style="height:22px;">
							<option value="">性别</option>
							<option value="1">男</option>
							<option value="0">女</option>
						</select>
					</td>
					<td>
						<select id="searchDeptId" name="deptId" style="height:22px;"></select>
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
			<li><a class="add" href="${rootPath}/user/gotoUserAdd" target="dialog" rel="yuer_user_add" width="400" height="370" fresh="true" mask="true"><span>添加</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="10%" align="center">用户ID</th>
				<th width="10%" align="center">登录名</th>
				<th width="10%" align="center">显示名</th>
				<th width="5%" align="center">性别</th>
				<th width="10%" align="center">出生日期</th>
				<th width="10%" align="center">职务</th>
				<th width="10%" align="center">部门</th>
				<th width="10%" align="center">角色</th>
				<th width="15%" align="center">最后登录时间</th>
				<th width="10%" align="center">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pageInfo.list}" var="user">
				<tr target="${user.id }" rel="${user.id }">
					<td>${user.id }</td>
					<td>${user.loginName }</td>
					<td>${user.showName }</td>
					<td>${user.sex }</td>
					<td>${user.brithday }</td>
					<td>${user.job }</td>
					<td>${user.deptStr }</td>
					<td>${user.roleStr} </td>
					<td>${user.lastLoginTime }</td>
					<td>
						<a title="删除" href="javascript:void(0)" onclick="deleteUser(${user.id})" class="btnDel">删除</a>
						<a title="编辑" class="btnEdit" target="dialog" href="${rootPath}/user/gotoUserUpdate?userId=${user.id }" rel="yuer_user_update" width="400" height="370" fresh="true" mask="true">编辑</a>
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

