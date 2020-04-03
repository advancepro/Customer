<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<title>Customer details</title>
<body>
<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>ID:</td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>First name:</td>
        <td>${customer.firstName}</td>
    </tr>
    <tr>
        <td>Last name:</td>
        <td>${customer.lastName}</td>
    </tr>
    <tr>
        <td>emailAddress:</td>
        <td>${customer.emailAddress}</td>
    </tr>
    <tr>
        <td>jobTitle:</td>
        <td>${customer.jobTitle}</td>
    </tr>
    <tr>
        <td>mobilePhone:</td>
        <td>${customer.mobilePhone}</td>
    </tr>
    <tr>
        <td>city:</td>
        <td>${customer.city}</td>
    </tr>
    <tr>
        <td>webPage:</td>
        <td>${customer.webPage}</td>
    </tr>
</table>
</body>
</html>