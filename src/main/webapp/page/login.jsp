<%--
  Created by IntelliJ IDEA.
  User: h3ilang
  Date: 2017/3/14
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="/v1/login" method="post">
    <table>
        <thead>
        <tr>
            <th>登录窗口</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><label for="username"></label><input type="text" id="username" name="username"/></td>
        </tr><tr>
            <td><label for="password"></label><input type="password" id="password" name="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"/></td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
