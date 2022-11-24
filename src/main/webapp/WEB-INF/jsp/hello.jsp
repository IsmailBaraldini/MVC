<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.11.2022
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sample</title>
</head>
<body>
    <c:forEach items="${students}" var="students">
        ${students}
    </c:forEach>

    Hello World
</body>
</html>
