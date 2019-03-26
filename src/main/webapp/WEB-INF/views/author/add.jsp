<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add author</title>
</head>
<body>
<form:form method="post" modelAttribute="author">
    First name: <form:input type="TEXT" path="firstName"/><br>
    Last name: <form:input type="TEXT" path="lastName"/><br>
    <input type="submit" value="Submit"/>
</form:form>

<a href="/author/list">List authors</a>

</body>
</html>
