<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath() %>/static/css/themes/default/style.css?v=0.01"/>
<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath() %>/static/css/themes/css/core.css"/>
<link rel="stylesheet" type="text/css" media="print" href="<%=request.getContextPath() %>/static/css/themes/css/print.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="<%=request.getContextPath() %>/static/js/uploadify/css/uploadify.css"/>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/sys_main.js?v=0.01"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery.validate.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery.bgiframe.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/xheditor/xheditor-1.2.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/xheditor/xheditor_lang/zh-cn.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/uploadify/scripts/jquery.uploadify.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/chart/raphael.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/chart/g.raphael.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/chart/g.bar.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/chart/g.line.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/chart/g.pie.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/chart/g.dot.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/dwz.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/dwz.regional.zh.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/home.js?v=1.0"></script>
</head>
<body>
<div id="layout">
	<div id="header">
		<div class="headerNav">
			<a class="logo" href="http://j-ui.com">标志</a>
			<ul class="nav">
				<li><a href="#">${user.showName }</a></li>
				<li><a href="login.html">退出</a></li>
			</ul>
		</div>
	</div>

	<div id="leftside">
		<div id="sidebar_s">
			<div class="collapse">
				<div class="toggleCollapse"><div></div></div>
			</div>
		</div>
		<div id="sidebar">
			<div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>

			<div class="accordion" fillSpace="sidebar">
				<c:forEach items="${menus}" var="menu">
					<div class="accordionHeader">
						<h2><span>Folder</span>${menu.name }</h2>
					</div>
					<div class="accordionContent">
						<ul class="tree treeFolder">
							<c:forEach items="${menu.childMenus }" var="childMenu">
								<li><a href="<%=request.getContextPath() %>${childMenu.url}" target="navTab" rel="${childMenu.code }">${childMenu.name }</a></li>
							</c:forEach>
						</ul>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<div id="container">
		<div id="navTab" class="tabsPage">
			<div class="tabsPageHeader">
				<div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
					<ul class="navTab-tab">
						<li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
					</ul>
				</div>
				<div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
				<div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
				<div class="tabsMore">more</div>
			</div>
			<ul class="tabsMoreList">
				<li><a href="javascript:;">我的主页</a></li>
			</ul>
			<div class="navTab-panel tabsPageContent layoutBox">
				<div class="page unitBox">
					<div class="accountInfo">
						
					</div>
					<div class="pageFormContent" layoutH="80" style="margin-right:230px">
						123
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div id="footer">Copyright &copy; 2017 鱼儿CRM </div>
</body>
</html>