<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
	<!-- start sidebar1 -->
	<div id="sidebar1" class="sidebar">
		<ul>
			<li id="blogerInfo">
				<h2>博主信息</h2>
					<div id="infos">
                        <img src="images/blogerImage.jpg" />
                        <div id="info">
                            <table>
                                <tr><td>昵称:</td><td id="blogerName">流沙</td></tr>
                                <tr><td>等级:</td><td>10</td></tr>
                                <tr><td>访问量:</td><td>10,000</td></tr>
                            </table>
                        </div>
					</div>
			</li>
			<li id="calendar">
				<h2>日历</h2>
				<div id="calendar_wrap">

				</div>
			</li>
			<li id="categories-1">
				<h2>文章类别</h2>
				<ul>
					<li><a href="#" title="View all posts filed under Uncategorized">Uncategorized</a> (3) </li>
					<li><a href="#" title="View all posts filed under Lorem Ipsum">Lorem Ipsum</a> (42) </li>
					<li><a href="#" title="View all posts filed under Urna Congue Rutrum">Urna Congue Rutrum</a> (28) </li>
					<li><a href="#" title="View all posts filed under Augue Praesent">Augue Praesent</a> (55) </li>
					<li><a href="#" title="View all posts filed under Vivamus Fermentum">Vivamus Fermentum</a> (13) </li>
				</ul>
			</li>
			<li id="archives">
				<h2>我的档案</h2>
				<ul>
					<li><a href="#">November 2007</a>&nbsp;(24)</li>
					<li><a href="#">October 2007</a>&nbsp;(31)</li>
					<li><a href="#">September 2007</a>&nbsp;(30)</li>
					<li><a href="#">August 2007</a>&nbsp;(31)</li>
					<li><a href="#">July 2007</a>&nbsp;(31)</li>
					<li><a href="#">June 2007</a>&nbsp;(30)</li>
					<li><a href="#">May 2007</a>&nbsp;(31)</li>
					<li><a href="#">April 2007</a>&nbsp;(30)</li>
					<li><a href="#">March 2007</a>&nbsp;(31)</li>
					<li><a href="#">February 2007</a>&nbsp;(28)</li>
					<li><a href="#">January 2007</a>&nbsp;(31)</li>
				</ul>
			</li>
		</ul>
	</div>
	<!-- end sidebar1 -->
