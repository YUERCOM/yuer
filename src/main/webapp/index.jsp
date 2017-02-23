<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/static/css/index.css"/>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/sys_main.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/login_index.js?v=0.01"></script>
</head>
	<body>
		<form id="loginForm">
			<div style="border:1px solid #A9C3DD; width:300px;height:170px;margin:0 auto;margin-top:150px;border-radius:10px;">
				<table style="width:100%;">
					<tr>
						<td colspan="2" align="center">
							<p style="margin-top:10px;margin-bottom:10px;font-weight:bold;">后台管理系统</p>
						</td>
					</tr>
					<tr>
						<td align="right" width=65px><p style="margin-top:10px;margin-bottom:10px;font-size:14px;">账号：</p></td>
						<td><input id="loginName" name="loginName" type="text" style="width:200px;height:30px;border-radius:5px;margin-right:5px;border:1px solid #A9C3DD;outline:none;padding-left:5px;padding-right:5px;"/></td>
					</tr>
					<tr>
						<td align="right"><p style="margin-top:10px;margin-bottom:10px;font-size:14px;">密码：</p></td>
						<td><input id="password" name="password" type="password" style="width:200px;height:30px;border-radius:5px;border:1px solid #A9C3DD;outline:none;padding-left:5px;padding-right:5px;"></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<button id="loginButton" type="button" style="border:1px solid #A9C3DD;width:100px;height:30px;border-radius:5px;cursor:pointer;">登  录</button>
						</td>
					</tr>
				</table>
			</div>
		</form>
		<div id="errorDiv" style="width:500px;height:30px;margin:0 auto;text-align:center;line-height:30px;color:red;font-size:12px;">
			
		</div>
	</body>
</html>
