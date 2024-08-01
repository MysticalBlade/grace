<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<h2>Login</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    <!-- CSRF Token -->
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

    <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required />
    </div>

    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required />
    </div>

    <div>
        <button type="submit">Login</button>
    </div>

    <!-- Error Message -->
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
</form>
</body>
</html>
