<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/08/2021
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/tinh" method="post">
    <input type="number" name="var1" id="var1"><input type="number" name="var2" id="var2"><br>
    <button type="submit" name="maytinh" value="+">addition(+)</button>
    <button type="submit" name="maytinh" value="-">Subtraction(-)</button>
    <button type="submit" name="maytinh" value="*">Multiplication(X)</button>
    <button type="submit" name="maytinh" value="/">Division(/)</button>
    <h3>Result :${caculatorx}</h3>
</form>
</body>
</html>
