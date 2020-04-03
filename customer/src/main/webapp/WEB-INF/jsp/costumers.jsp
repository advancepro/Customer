<%--
  Created by IntelliJ IDEA.
  User: snowleopard
  Date: 3/22/18
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Costumers page</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>emailAddress</th>
        <th>jobTitle</th>
        <th>mobilePhone</th>
        <th>city</th>
        <th>webPage</th>




    </tr>
    <c:forEach items="${costumers}" var="costumer">
        <tr>
            <td>${costumers.id}</td>
            <td>${costumers.firstName}</td>
            <td>${costumers.lastName}</td>
            <td>${costumers.em}</td>
            <td><a href="/getCostumer?id=${costumer.id}">View details</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
