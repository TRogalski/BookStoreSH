<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Authors list</title>
</head>
<body>

<table border="1">
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th></th>
    </tr>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td><a href="edit/${author.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>

<a href="/author/add">Add</a>

</body>
</html>
