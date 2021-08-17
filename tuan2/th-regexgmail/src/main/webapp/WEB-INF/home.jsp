<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/08/2021
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 style="color:red">${message}</h3>
<form action="/validate" method="post">
    <p>enter gmail</p>
    <input type="text" name="email">
    <button type="submit">send</button>
</form>
</body>
</html>
