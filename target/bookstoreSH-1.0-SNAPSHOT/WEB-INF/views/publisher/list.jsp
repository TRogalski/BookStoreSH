<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Publishers list</title>
</head>
<body>

<%@ include file="/WEB-INF/views/main/nav-bar.html" %>

<table class="table">
    <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col"></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${publishers}" var="publisher">
            <tr>
                <td>${publisher.name}</td>
                <td><a href="edit/${publisher.id}">Edit</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
