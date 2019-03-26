<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>AddStudent</title>
</head>
<body>


<form:form method="post" modelAttribute="student">
    First name: <form:input type="TEXT" path="firstName"/><br>
    Last name: <form:input type="TEXT" path="lastName"/><br>
    Gender: <form:radiobutton name="gender" path="gender" value="male"/> Male<br>
            <form:radiobutton name="gender" path="gender" value="female"/> Female<br>
    Country: <form:select path="country" items="${countries}"/><br>
    Notes: <form:textarea path="notes"/><br>
    Mailing list: <form:checkbox path="mailingList"/><br>
    Programming skills: <form:select multiple="multiple" items="${programmingSkills}" path="programmingSkills"/><br>
    Hobbies: <form:checkboxes items="${hobbies}" path="hobbies"/><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
