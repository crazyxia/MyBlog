<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- end page -->
<div id="footer">
	<p class="legal">&copy;2013 All Rights Reserved.</p>
	<p class="credit">Design by <a href="#">流沙</a></p>
</div>

    <!-- 登录弹出框 -->
    <div id="loginWindow" title="登录">
    <form action="login.action" method="post" id="loginForm">
        <table>
            <tr><td>用户名：</td><td><input type="text" name="admin.userName" id="username"/></td></tr>
            <tr><td>密&nbsp;&nbsp;码：</td><td><input type="password" name="admin.password" id="password"/></td></tr>
            <tr><td colspan="2" id="error"></td></tr>
        </table>
    </form>
    </div>