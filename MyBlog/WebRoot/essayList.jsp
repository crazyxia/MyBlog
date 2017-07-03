<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>文章列表</title>
   <jsp:include page="/pages/import.jsp"/>
   <style type="text/css">
   	#content {
            word-wrap:break-word;/*防止文字超出content*/
            float:left;
            width:73%;
        }
    #essay{
    	width:100%;
    }
   </style>
   <script type="text/javascript">
   		$(function(){
   			var page=<%=session.getAttribute("currentPage").toString() %>;
   			$("#perPage").attr("href","essayList.action?page="+(page-1));
   			$("#nextPage").attr("href","essayList.action?page="+(page+1));
   		});
   </script>
</head>
<body>
<jsp:include page="/pages/header.jsp"/>
<!-- start page -->
<div id="page">
	<jsp:include page="/pages/panel.jsp"/>
	<div id="content">
		<ul>
		<s:iterator value="#request.essayList" id="essay">
		<li>
		<div id="essay">
			<a href="essay.action?id=<s:property value="#essay.id" />"><h1><s:property value="#essay.title" /></h1></a>
			<s:property value="#essay.context.substring(0, 50).concat('......')" />
		</div>
		</li>
    	</s:iterator>
		</ul>
		<a id="perPage" >上一页</a>
		<a id="nextPage" >下一页</a>
	</div>
	<div style="clear: both;">&nbsp;</div>
</div>
<!-- end page -->
<jsp:include page="/pages/footer.jsp"/>
</body>
</html>