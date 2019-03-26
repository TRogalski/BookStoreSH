<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Remove publisher</title>
</head>
<body>


<table border="1">
    <tr>
        <th>Name</th>
    </tr>
    <tr>
        <td>${publisher.name}</td>
    </tr>
</table>

<br>
<form:form method="post" action="/publisher/remove">
    <p>Do you confirm that above publisher should be removed?</p><br>

    <input type="hidden" var="id" name="id" value="${publisher.id}"/>
    <input type="submit" value="Confirm"/>
</form:form>


<a href="/publisher/list">List</a>

</body>
</html>