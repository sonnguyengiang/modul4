<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/08/2021
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich</h1>

<%--@elvariable id="sandwich" type="controller"--%>
<form:form modelAttribute="sandwich" action="/create" method="post">
    skin: <form:input path="skin"/><br>
    nhan banh: <form:checkboxes path="nhanBanh" items="${nhanBanh}"/><br>
    <button type="submit">create</button>
</form:form>
</body>
</html>
