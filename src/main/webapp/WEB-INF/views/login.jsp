
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/7 0007
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${error}
<form action="login" method="post">
    Username: <input type="text" name="username"><br>
    Password:<input type="password" name="password"><br>
    <input type="submit" value="login">
</form>
</body>
</html>