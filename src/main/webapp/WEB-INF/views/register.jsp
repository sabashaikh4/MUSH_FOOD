<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>Register</h2>

    <form action="/user/register" modelAttribute="user" method="post">
        Email: <form:input path="email" /><br/>
        Password: <form:password path="password" /><br/>
        <input type="submit" value="Register">
    </form>
</body>
</html>
