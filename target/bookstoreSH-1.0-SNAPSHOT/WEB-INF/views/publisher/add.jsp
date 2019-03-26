<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add publisher</title>
</head>
<body>
<%@ include file="/WEB-INF/views/main/nav-bar.html" %>

<form:form method="post" modelAttribute="publisher" class="form-horizontal">
    <div class="form-group">
        <label for="name" class="control-label col-sm-1">First name:</label>
        <div class="col-sm-6">
            <form:input type="TEXT" path="name" class="form-control" id="name"/>
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
