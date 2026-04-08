<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/8/2026
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<h2>Danh sách nhân viên</h2>
<table border="1" cellpadding="5" cellspacing="0">
  <tr>
    <th>STT</th>
    <th>Mã NV</th>
    <th>Họ tên</th>
    <th>Phòng ban</th>
    <th>Lương</th>
    <th>Ngày vào làm</th>
    <th>Trạng thái</th>
    <th>Chi tiết</th>
  </tr>
  <c:forEach var="emp" items="${employees}" varStatus="st">
    <tr>
      <td><c:out value="${st.count}"/></td>
      <td><c:out value="${emp.code}"/></td>
      <td><c:out value="${emp.name}"/></td>
      <td><c:out value="${emp.department}"/></td>
      <td>
        <fmt:formatNumber value="${emp.salary}" type="currency" currencySymbol="VNĐ"/>
      </td>
      <td>
        <fmt:formatDate value="${emp.startDate}" pattern="dd/MM/yyyy"/>
      </td>
      <td>
        <c:choose>
          <c:when test="${emp.status == 'Đang làm'}">
            <span style="color:green;font-weight:bold"><c:out value="${emp.status}"/></span>
          </c:when>
          <c:when test="${emp.status == 'Nghỉ phép'}">
            <span style="color:orange;font-weight:bold"><c:out value="${emp.status}"/></span>
          </c:when>
          <c:when test="${emp.status == 'Thử việc'}">
            <span style="color:blue;font-weight:bold"><c:out value="${emp.status}"/></span>
          </c:when>
          <c:otherwise>
            <c:out value="${emp.status}"/>
          </c:otherwise>
        </c:choose>
      </td>
      <td>
        <a href="<c:url value='/employees/${emp.code}'/>">Xem chi tiết</a>
      </td>
    </tr>
  </c:forEach>
</table>

<p><b>Tổng lương phòng Kỹ thuật:</b>
  <fmt:formatNumber value="${totalTechSalary}" type="currency" currencySymbol="VNĐ"/>
</p>


