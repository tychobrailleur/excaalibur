<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name='layout' content='main' />
</head>
<body>
    <h2>Registration</h2>

    <g:form name="registration" action="index" method="POST">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username">
        <g:renderErrors bean="${user}" as="list" field="username"/>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password">
        <label for="password-confirmation">Confirm Password:</label>
        <input type="password" name="password-confirm" id="password-confirmation">
        <input type="submit" name="register" value="Register!">
    </g:form>
</body>
</html>