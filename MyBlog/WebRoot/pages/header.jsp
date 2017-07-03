<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<div id="header">
	<div id="logo">
		<h1><a href="#">欢迎访问</a> :</h1>
		<h2><a href="#">流沙的博客</a></h2>
	</div>
	<div id="menu">
		<ul>
			<li><a href="<%=path %>/index.jsp">首页</a></li>
			<li><a href="essayList.action?page=1">文章</a></li>
			<li><a href="#">照片</a></li>
			<li><a href="#">关于</a></li>
			<li><a href="#" id="adminLogin">
			<%if(session.getAttribute("admin")!=null){ 
			%>已登录<%
			}else{ %>登录<%} %></a></li>
		</ul>
	</div>
</div>
