<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Publishers list</title>
</head>
<body>

<table border="1">
    <tr>
        <th>Name</th>
        <th></th>
    </tr>
    <c:forEach items="${publishers}" var="publisher">
        <tr>
            <td>${publisher.name}</td>
            <td><a href="edit/${publisher.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>

<a href="/publisher/add">Add</a>

</body>
</html>
