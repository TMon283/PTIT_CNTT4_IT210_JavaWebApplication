<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/8/2026
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Đây là trang chủ</h1>
    <c:forEach items="${listStudent}" var="s">
        <p><c:out value="${s.id}"></c:out></p>
        <p><c:out value="${s.fullName}"></c:out></p>
        <p><c:out value="${s.age}"></c:out></p>
        <p><c:out value="${s.gender ? 'Nam' : 'Nữ'}"></c:out></p>
    </c:forEach>
</body>
</html>
