<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>首页</title>
   <jsp:include page="/pages/import.jsp"/>
</head>
<body>
<jsp:include page="/pages/header.jsp"/>
<!-- start page -->
<div id="page">
	<jsp:include page="/pages/panel.jsp"/>
	<!-- start content -->
	<div id="content">
		<div class="post">
			<h1 class="title">欢迎访问流沙的博客</h1>
			<p class="meta">流沙编写与12月20日</p>
			<div class="entry">

		    </div>
		</div>
	</div>
	<!-- end content -->
	<!-- start sidebar2 -->
	<div id="sidebar2" class="sidebar">
		<ul>
			<li id="recent-posts">
				<h2>最近留言</h2>
				<ul>
					<li>
						<h3><a href="#">Aliquam Libero</a></h3>
						<p>Nullam  ante orci, eget, tempus quis, ultrices in, est. Curabitur sit amet  nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat vel,  suscipit in, mattis placerat, nulla. Sed ac leo. Pellentesque  imperdiet. <a href="#">More&hellip;</a></p>
					</li>
					<li>
						<h3><a href="#">Semper Vestibulum</a></h3>
						<p>Donec  leo, vivamus fermentum nibh in augue praesent a lacus at urna congue  rutrum. Quisque dictum integer nisl risus, sagittis convallis, rutrum  id, congue, and nibh. <a href="#">More&hellip;</a></p>
					</li>
					<li>
						<h3><a href="#">Etiam Malesuada</a></h3>
						<p>Donec  leo. Vivamus fermentum nibh in augue. Praesent a lacus at urna congue  rutrum. Nulla enim eros, porttitor eu, tempus id, varius non, nibh.  Duis enim nulla, luctus eu, dapibus lacinia, venenatis id, quam.  Vestibulum imperdiet, magna nec eleifend rutrum, nunc lectus vestibulum  velit, euismod lacinia quam nisl id lorem. <a href="#">More&hellip;</a></p>
					</li>
					<li>
						<h3><a href="#">Sagittis Leo Vehicula</a></h3>
						<p>Nam in massa. Sed vel tellus. Curabitur sem urna, consequat vel,  suscipit in, mattis placerat, nulla. Sed ac leo. Pellentesque  imperdiet. <a href="#">More&hellip;</a></p>
					</li>
					<li>
						<h3><a href="#">Etiam Malesuada</a></h3>
						<p>Donec  leo. Vivamus fermentum nibh in augue. Praesent a lacus at urna congue  rutrum. Nulla enim eros, porttitor eu, tempus id, varius non, nibh.  Duis enim nulla, luctus eu, dapibus lacinia, venenatis id, quam.  Vestibulum imperdiet, magna nec eleifend rutrum, nunc lectus vestibulum  velit, euismod lacinia quam nisl id lorem. <a href="#">More&hellip;</a></p>
					</li>
					<li>
						<h3><a href="#">Sagittis Leo Vehicula</a></h3>
						<p>Nullam  ante orci, eget, tempus quis, ultrices in, est. Curabitur sit amet  nulla. Nam in massa. Sed vel tellus. Curabitur sem urna, consequat vel,  suscipit in, mattis placerat, nulla. Sed ac leo. Pellentesque  imperdiet. <a href="#">More&hellip;</a></p>
					</li>
				</ul>
			</li>
		</ul>
	</div>
	<!-- end sidebar2 -->
	<div style="clear: both;">&nbsp;</div>
</div>
<!-- end page -->
<jsp:include page="/pages/footer.jsp"/>
</body>
</html>