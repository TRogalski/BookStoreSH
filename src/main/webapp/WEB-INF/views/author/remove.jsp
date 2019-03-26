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
            <th scope="col">First name</th>
            <th scope="col">Last name</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
        </tr>
    </tbody>
</table>

<br>


<form:form method="post" action="/author/remove" class="form-horizontal">
    <p class="h4">Do you confirm that above author should be removed?</p><br>

    <input type="hidden" var="id" name="id" value="${author.id}"/>

    <div class="form-group">
        <div class="col-sm-1">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form:form>

</body>
</html>