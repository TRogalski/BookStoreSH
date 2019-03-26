<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add book</title>
</head>
<body>
<%@ include file="/WEB-INF/views/main/nav-bar.html" %>

<form:form method="post" modelAttribute="book" class="form-horizontal">
    <div class="form-group">
        <label for="title" class="control-label col-sm-1">Title:</label>
        <div class="col-sm-6">
            <form:input type="TEXT" path="title" class="form-control" id="title"/>
        </div>
    </div>
    <div class="form-group">
        <label for="rating" class="control-label col-sm-1">Rating:</label>
        <div class="col-sm-6">
            <form:input type="TEXT" path="rating" class="form-control" id="rating"/>
        </div>
    </div>
    <div class="form-group">
        <label for="description" class="control-label col-sm-1">Description:</label>
        <div class="col-sm-6">
            <form:input type="TEXT" path="description" class="form-control" id="description"/>
        </div>
    </div>
    <div class="form-group">
        <label for="publisher" class="control-label col-sm-1">Publishers:</label>
        <div class="col-sm-6">
            <form:select path="publisher" items="${publishers}" itemLabel="name" itemValue="id"
                         class="form-control" id="publisher"/>
        </div>
    </div>
    <div class="form-group">
        <label for="authors" class="control-label col-sm-1">Authors:</label>
        <div class="col-sm-6">
            <form:select multiple="true" items="${authors}" itemLabel="lastName" itemValue="id" path="authors"
                         class="form-control" id="authors"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-1">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form:form>

</body>
</html>
