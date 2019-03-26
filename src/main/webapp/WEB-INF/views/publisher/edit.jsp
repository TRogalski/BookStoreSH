<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Edit publisher</title>
</head>
<body>
<form:form method="post" modelAttribute="publisher" action="/publisher/edit">
    Name: <form:input type="TEXT" path="name"/><br>
    <input type="submit" value="Submit"/>
</form:form>

<a href="/publisher/remove/${publisher.id}">Remove</a>
<a href="/publisher/list">List books</a>

</body>
</html>
