<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
	<link href="<%=path %>/Css/style.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="<%=path %>/Css/sunny/jquery-ui-1.10.3.custom.css" rel="stylesheet" />
    <script src="<%=path %>/Scripts/jquery-1.8.2.js"></script>
    <script src="<%=path %>/Scripts/jquery-ui-1.10.3.custom.js"></script>
    <script type="text/javascript">
        $(function () {
            //设置日历
            $.datepicker.regional["zh-CN"] = {
                closeText: "关闭", prevText: "&#x3c;上月",
                nextText: "下月&#x3e;", currentText: "今天",
                monthNames: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
                monthNamesShort: ["一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"],
                dayNames: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"],
                dayNamesShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
                dayNamesMin: ["日", "一", "二", "三", "四", "五", "六"],
                weekHeader: "周", dateFormat: "yy-mm-dd", firstDay: 1, isRTL: !1,
                showMonthAfterYear: !0, yearSuffix: "年"
            }
            $.datepicker.setDefaults($.datepicker.regional["zh-CN"]);
            $("#calendar_wrap").datepicker({
                inline:true
            });

            //注册登录窗口
            $('#loginWindow').dialog({
                autoOpen: false,
                bgiframe: true, //解决ie6中遮罩层盖不住的问题  
                width: 300,
                height: 300,
                modal: true,//这个就是遮罩效果   
                buttons: {
                    "Ok": function () {
                        //向action发送登录请求
                        if ($("#error").html() == "") {
                            $("#loginForm").submit();
                            //登录成功关掉对话框
                            $(this).dialog("close");
                        }
                        else
                        {
                            alert("请保证用户名及密码均正确");
                        }
                        
                    },
                    "Cancel": function () {
                        $(this).dialog("close");
                    }
                }
            });
            //注册用户名ajax验证事件
            $("#username").blur(function () {
                //!!!发送ajax请求,验证用户名
                $.get("CheckAdminServlet", { username: $(this).val() }, function (data) {
                    if (data.trim() != "usernameOk")
                    {
                        $("#error").css("color", "red").html("用户名错误");
                    }
                });
            }).focus(function () {
                $("#error").removeClass("color").html("");
            });

            $("#password").blur(function () {
                //!!!发送ajax请求,验证用户名和密码
                $.get("CheckAdminServlet", { username: $("#username").val(),password:$(this).val() }, function (data) {
                    if (data.trim() != "allOk") {
                        $("#error").css("color", "red").html("用户名或密码错误");
                    }
                });
            }).focus(function () {
                $("#error").removeClass("color").html("");
            });

            //处理登录
            $("#adminLogin").click(function () {
                if ($(this).html().trim() == "登录") {
                    $('#loginWindow').dialog("open");
                }
            });

        });
    </script>