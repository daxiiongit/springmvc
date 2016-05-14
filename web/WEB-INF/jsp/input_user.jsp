<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>登录</title>

</head>

<body>
<form action="save_user.action" method="post">
    用户名 <input type="text" name="username" />
    <br>
    密码 <input type="password" name="password" />
    <input type="submit" value="登录">

    <br>
    user:${user.username}
    <br>
    user:${user.password}
    <br>
</form>
</body>
</html>
