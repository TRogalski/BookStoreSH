<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>EditBook</title>
</head>
<body>
<form:form method="post" modelAttribute="book" action="/book/edit">
    Title: <form:input type="TEXT" path="title"/><br>
    Rating: <form:input type="TEXT" path="rating"/><br>
    Description: <form:input type="TEXT" path="description"/><br>
    Publisher: <form:select path="publisher" items="${publishers}" itemLabel="name" itemValue="id"/><br>
    <%--Authors: <form:textarea path="authors"/><br>--%>
    <form:hidden path="id" value="${book.id}"></form:hidden>
    <input type="submit" value="Submit"/>
</form:form>

<a href="/book/remove/${book.id}">Remove</a>
<a href="/book/showall">List books</a>

</body>
</html>
