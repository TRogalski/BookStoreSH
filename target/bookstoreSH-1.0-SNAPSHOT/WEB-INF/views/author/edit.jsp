<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Edit author</title>
</head>
<body>
<%@ include file="/WEB-INF/views/main/nav-bar.html" %>

<form:form method="post" modelAttribute="author" action="/author/edit" class="form-horizontal">
    <div class="form-group">
        <label for="firstName" class="control-label col-sm-1">First name:</label>
        <div class="col-sm-6">
            <form:input type="TEXT" path="firstName" class="form-control" id="firstName"/>
        </div>
    </div>
    <div class="form-group">
        <label for="lastName" class="control-label col-sm-1">Last name:</label>
        <div class="col-sm-6">
            <form:input type="TEXT" path="lastName" class="form-control" id="lastName"/>
        </div>
    </div>

    <form:hidden path="id" value="${author.id}"></form:hidden>

    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-1">
            <button type="submit" class="btn btn-default">Submit</button>
            <a href="/author/remove/${author.id}" class="btn btn-default" role="button">Remove</a>
        </div>
    </div>
</form:form>

</body>
</html>
