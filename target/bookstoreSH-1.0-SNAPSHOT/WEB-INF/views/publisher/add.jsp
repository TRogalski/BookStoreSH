<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add publisher</title>
</head>
<body>
<form:form method="post" modelAttribute="publisher">
    Name: <form:input type="TEXT" path="name"/><br>
    <input type="submit" value="Submit"/>
</form:form>

<a href="/book/list">List publishers</a>

</body>
</html>
