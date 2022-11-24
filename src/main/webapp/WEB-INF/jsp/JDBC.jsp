<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JDBC</title>

</head>
<body>
<c:forEach var="Name" items="${names}">
    <p>${Name}</p>
</c:forEach>
    All good
</body>
</html>
