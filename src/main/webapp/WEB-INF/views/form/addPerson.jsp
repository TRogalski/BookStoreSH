<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>AddPerson</title>
</head>
<body>
    <form:form method="post" modelAttribute="person">
        Login: <form:input path="login"/><br>
        Password: <form:input path="password"/><br>
        Mail: <form:input type="password" path="email"/><br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
