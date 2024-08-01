<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: annie
  Date: 7/25/24
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit User</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-container label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        .form-container input[type="text"],
        .form-container input[type="email"],
        .form-container input[type="password"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        .form-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
        button {
            display: block;
            margin: 20px auto;
        }
        .button-container {
            text-align: center;
        }
        .button-container a, .button-container button {
            display: inline-block;
            padding: 10px 20px;
            margin: 5px;
            text-decoration: none;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .button-container a:hover, .button-container button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateUser" method="post">
    <input type="hidden" id="id" name="id" value="${user.id}">

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${user.name}"><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${user.email}"><br><br>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address" value="${user.address}"><br><br>


    <label for="password">Password:</label>
    <input type="password" id="password" name="password" value="${user.password}"><br><br>

    <label for="phoneNumber">Phone Number:</label>
    <input type="text" id="phoneNumber" name="phoneNumber" value="${user.phoneNumber}"><br><br>

    <input  type="submit" value="Update">


</form>
<div class="button-container">
    <button onclick="window.location.href='http://localhost:8082'">Back to Homepage</button>

</div>
</body>
</html>
