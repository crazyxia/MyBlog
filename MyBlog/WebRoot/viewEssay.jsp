<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>浏览文章</title>
   <jsp:include page="/pages/import.jsp"/>
   <style type="text/css">
   	#content {
            word-wrap:break-word;/*防止文字超出content*/
            float:left;
            width:73%;
        }
   </style>
</head>
<body>
<jsp:include page="/pages/header.jsp"/>
<!-- start page -->
<div id="page">
	<jsp:include page="/pages/panel.jsp"/>
	<div id="content">
		<h1 id="essayTitle"><s:property value="#request.essay.title"></s:property></h1>
		<h3 id="essayDate"><s:property value="#request.essay.writeTime"></s:property></h3>
		<div id="essayContext"><s:property value="#request.essay.context"></s:property></div>
	</div>
	<div style="clear: both;">&nbsp;</div>
</div>
<!-- end page -->
<jsp:include page="/pages/footer.jsp"/>
</body>
</html>