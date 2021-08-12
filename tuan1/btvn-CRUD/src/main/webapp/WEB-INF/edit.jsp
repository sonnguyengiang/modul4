<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/08/2021
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h2>Create Table</h2>
    <p>Show list student</p>
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
        <form method="post">
            <tbody>
            <tr>
                <td><input type="text" placeholder="enter id" name="id" value="${listEdit.id}"></td>
                <td><input type="text" placeholder="enter name" name="name" value="${listEdit.name}"></td>
                <td><input type="test" placeholder="enter gmail" name="gmail" value="${listEdit.gmail}"></td>
                <td><input type="text" placeholder="enter address" name="address" value="${listEdit.address}"></td>
                <td>
                    <button type="submit" class="btn btn-success">edit</button>
                </td>
            </tr>
            </tbody>
        </form>
    </table>
</div>
</body>
</html>
