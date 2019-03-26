<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Books list</title>
</head>
<body>

<%@ include file="/WEB-INF/views/main/nav-bar.html" %>

<table class="table">
    <thead>
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Rating</th>
            <th scope="col">Description</th>
            <th scope="col">Publisher</th>
            <th scope="col">Author</th>
            <th scope="col"></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.title}</td>
                <td>${book.rating}</td>
                <td>${book.description}</td>
                <td>${book.publisher.name}</td>
                <td>
                    <c:forEach items="${book.authors}" var="author">
                        ${author.firstName}, ${author.lastName}<br>
                    </c:forEach>
                </td>
                <td><a href="edit/${book.id}">Edit</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
