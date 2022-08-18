<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<caption>Product list</caption>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>JoinDate</th>
			<th>Role</th>
		</tr>
		<c:forEach var="e" items="${sessionScope.list}">
			<tr>
				<td>${e.eid}</td>
				<td>${e.name}</td>
				<td>${e.email}</td>
				<td>${e.joinDate}</td>
				<td>${e.role}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/">Register</a>
</body>
</html>