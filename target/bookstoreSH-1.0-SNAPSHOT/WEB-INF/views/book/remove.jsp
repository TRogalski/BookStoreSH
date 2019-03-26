<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Remove book</title>
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
        </tr>
    </thead>
    <tbody>
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
        </tr>
    </tbody>
</table>

<br>
<form:form method="post" action="/book/remove" class="form-horizontal">
    <p class="h4">Do you confirm that above book should be removed?</p><br>

    <input type="hidden" var="id" name="id" value="${book.id}"/>

    <div class="form-group">
        <div class="col-sm-1">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form:form>

</body>
</html>