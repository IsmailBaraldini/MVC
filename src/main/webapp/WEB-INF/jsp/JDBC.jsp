<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 24.11.2022
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JDBC</title>
    <c:forEach var="user" items="${names}">
        <p>${user}</p>
    </c:forEach>
</head>
<body>
    All good
</body>
</html>
