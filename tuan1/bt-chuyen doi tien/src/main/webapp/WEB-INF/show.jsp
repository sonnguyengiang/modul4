<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/08/2021
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>chuyển đổi tiền</h1>
<form action="/tinh" method="post">
    <input type="text" name="var1">
    <select name="change">
        <option value="vn">
            -->vn
        </option>
        <option value="usd">
            -->usd
        </option>
    </select>
    <button type="submit">chuyen</button>
    <br><h3>result = ${ketqua}</h3>
</form>
</body>
</html>
