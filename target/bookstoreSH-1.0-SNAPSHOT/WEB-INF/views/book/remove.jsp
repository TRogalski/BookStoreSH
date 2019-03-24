<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>RemoveBook</title>
</head>
<body>


<table border="1">
    <tr>
        <th>Title</th>
        <th>Rating</th>
        <th>Description</th>
        <th>Publisher</th>
        <th>Author</th>
    </tr>
    <tr>
        <td>${book.title}</td>
        <td>${book.rating}</td>
        <td>${book.description}</td>
        <td>${book.publisher}</td>
        <td>${book.authors}</td>
    </tr>
</table>

<br>
<form:form method="post" action="/book/remove">
    <p>Do you confirm that above book should be removed?</p><br>

    <input type="hidden" var="id" name="id" value="${book.id}"/>
    <input type="submit" value="Confirm"/>
</form:form>


<a href="/book/showall">List</a>

</body>
</html>