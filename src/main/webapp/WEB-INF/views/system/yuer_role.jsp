<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="accountInfo">

</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><span>添加无权限</span></li>
			<!-- <li><a class="add" href="#" target="navTab"><span>添加</span></a></li> -->
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="10%" align="center">角色ID</th>
				<th width="15%" align="center">角色名称</th>
				<th width="15%" align="center">角色编码</th>
				<th width="30%">角色描述</th>
				<th width="10%" align="center">创建时间</th>
				<th width="10%" align="center">修改时间</th>
				<th width="10%" align="center">操作</th>
			</tr>
		</thead>
		<tbody>
			<tr target="sid_user" rel="1">
				<td>天津农信社</td>
				<td>A120113196309052434</td>
				<td title="天津市华建装饰工程有限公司">天津市华建装饰工程有限公司</td>
				<td>联社营业部</td>
				<td>2009-05-21</td>
				<td>2009-05-21</td>
				<td>
					<a title="删除" target="ajaxTodo" href="demo/common/ajaxDone.html?id=xxx" class="btnDel">删除</a>
					<a title="编辑" target="navTab" href="demo_page4.html?id=xxx" class="btnEdit">编辑</a>
				</td>
			</tr>
		</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>显示</span>
			<select class="combox" name="numPerPage" onchange="navTabPageBreak({numPerPage:this.value})">
				<option value="20">20</option>
				<option value="50">50</option>
				<option value="100">100</option>
				<option value="200">200</option>
			</select>
			<span>条，共${totalCount}条</span>
		</div>
		<div class="pagination" targetType="navTab" totalCount="2" numPerPage="20" pageNumShown="10" currentPage="1"></div>
	</div>
</div>

