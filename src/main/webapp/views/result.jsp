<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/05/2020
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <c:forEach items="${menu}" var="menu">
        <p>${menu}</p>
    </c:forEach>
</body>
</html>