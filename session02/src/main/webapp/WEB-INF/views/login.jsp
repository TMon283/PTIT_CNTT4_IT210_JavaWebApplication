<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/8/2026
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head><title>Đăng nhập</title></head>
<body>
<h2>Dang nhap</h2>
<form action="<c:url value='/login'/>" method="post">
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>
</form>
<c:if test="${not empty errorMessage}">
    <p style="color:red"><c:out value="${errorMessage}"/></p>
</c:if>
</body>
</html>

