<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/user/yuer_user_add.js?v=1.002"></script>
<div class="pageContent">
	<input id="hidden_sex" type="hidden" value="${userParam.sex }">
	<input id="hidden_deptId" type="hidden" value="${userParam.deptId }">
	<input id="hidden_roleId" type="hidden" value="${userParam.roleId }">
	<form id="saveUserForm" method="POST"class="pageForm">
		<input name="id" type="hidden" value="${userParam.id }">
		<div class="pageFormContent" layoutH="56">
			<p>
				<label>登录名：</label>
				<input name="loginName" class="required" type="text" size="20" value="${userParam.loginName }"/>
			</p>
			<p>
				<label>显示名：</label>
				<input name="showName" class="required" type="text" size="20" value="${userParam.showName }"/>
			</p>
			<p>
				<label>性别：</label>
				<select id="sex" name="sex" style="height:22px;width:150px;">
					<option value="">性别</option>
					<option value="1">男</option>
					<option value="0">女</option>
				</select>
			</p>
			<p>
				<label>出生日期：</label>
				<input type="text" name="brithday" class="date" size="20" value="${userParam.brithday }" />
			</p>
			<p>
				<label>职务：</label>
				<input name="job" type="text" size="20" value="${userParam.job }"/>
			</p>
			<p>
				<label>部门：</label>
				<select id="deptId" name="deptId" style="height:22px;width:150px;"></select>
			</p>
			<p>
				<label>角色：</label>
				<select id="roleId" name="roleId" style="height:22px;width:150px;"></select>
			</p>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="button" onclick="saveUser()">保存</button></div></div></li>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div>
				</li>
			</ul>
		</div>
	</form>
</div>