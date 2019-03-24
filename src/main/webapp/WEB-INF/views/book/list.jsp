<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>listBooks</title>
</head>
<body>

<table border="1">
    <tr>
        <th>Title</th>
        <th>Rating</th>
        <th>Description</th>
        <th>Publisher</th>
        <th>Author</th>
        <th></th>
        <th></th>
    </tr>
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
</table>

<a href="/book/add">Add</a>

</body>
</html>
