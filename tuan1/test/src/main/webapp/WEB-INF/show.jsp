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
    <button type="submit" name="maytinh" value="cong">addition(+)</button>
    <button type="submit" name="maytinh" value="tru">Subtraction(-)</button>
    <button type="submit" name="maytinh" value="nhan">Multiplication(X)</button>
    <button type="submit" name="maytinh" value="chia">Division(/)</button>
</form>
</body>
</html>
