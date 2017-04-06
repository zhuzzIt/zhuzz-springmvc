<%--
  Created by IntelliJ IDEA.
  User: h3ilang
  Date: 2017/3/14
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <%
        String path = request.getContextPath();
// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）:
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <title>欢迎页面</title>
    <base href="<%=basePath %>"/>
    <script type="text/javascript" src="/js/common/jquery/jquery-3.2.0.min.js" ></script>
    <script type="text/javascript">
        $(function () {
            $("#logoutBtn").click(function () {
               window.location = "/v1/logout"
            });
        });
    </script>
</head>
<body>
<input type="button" value="退出" id="logoutBtn"/>
<h1>hi,${nickname},欢迎!</h1>
<h2>basePath:<%=basePath %></h2>
</body>
</html>
