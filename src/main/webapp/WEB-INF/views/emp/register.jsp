<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome 2 Employee list</h2>
	<form:form method="post" modelAttribute="employee">
		<label>Employee Name</label>
		<form:input path="name"/><br>
		<label>Enter Email</label>
		<form:input path="email"/><br>
		<label>Enter Join Date</label>
		<form:input path="joinDate"/><br>
		<label>Is Permanent</label>
		<form:radiobutton path="Permanent" value="true"/><label>Yes</label>
		<form:radiobutton path="Permanent" value="false"/><label>No</label><br>
		<label>Enter Role</label>
		<form:input path="role"/><br>
		<input type="submit" value="register"/>
	</form:form>
</body>
</html>