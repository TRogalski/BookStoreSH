<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Remove book</title>
</head>
<body>


<table border="1">
    <tr>
        <th>First name</th>
        <th>Last name</th>
    </tr>
    <tr>
        <td>${author.firstName}</td>
        <td>${author.lastName}</td>
    </tr>
</table>

<br>
<form:form method="post" action="/author/remove">
    <p>Do you confirm that above author should be removed?</p><br>

    <input type="hidden" var="id" name="id" value="${author.id}"/>
    <input type="submit" value="Confirm"/>
</form:form>


<a href="/author/list">List</a>

</body>
</html>