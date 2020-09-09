<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<p> page jsp</p>
<p>model: ${test}</p>

<p>${lijst}</p>

<table border="1">
    <tr>
        <th>EMP ID</th>
        <th>Name</th>
        <th>Phone</th>
        <th>City</th>
    </tr>
    <c:forEach var="item" items="${lijst}">
        <tr>
            <td>${item.id}</td>
            <td>${item.tutorial_title}</td>
            <td align="center">${test}</td>
            <td align="center">${test}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>