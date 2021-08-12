<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/08/2021
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <title>Student List</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Student Table</h2>
    <p>Show list student</p>
    <form action="/customer/find" method="post">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Create</th>
                <th>Find</th>
            </tr>
            </thead>
            <tbody>
            <td><a href="/customer/create" class="btn btn-success">Create</a></td>
            <td><input placeholder="enter name" name="findName">
                <button type="submit" class="btn btn-primary">find</button>
            </td>
            </tbody>
        </table>
    </form>
</div>
<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>gmail</th>
            <th>address</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerList}" var="customer" varStatus="loop">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.gmail}</td>
                <td>${customer.address}</td>
                <td>
                    <a href="/customer/edit?index=${loop.index}" class="btn btn-warning">edit</a>
                    <a href="/customer/delete?index=${loop.index}" class="btn btn-danger">delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
