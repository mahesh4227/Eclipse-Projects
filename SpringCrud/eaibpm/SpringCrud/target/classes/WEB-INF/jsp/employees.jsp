<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
<h1> employees data</h1>
<form:form action="employee.do" method="POST" commandName="employee">
<table>
<tr>
<td>id</td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td>age</td>
<td><form:input path="age"/></td>
</tr>

<tr>
<td>name</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>salary</td>
<td><form:input path="salary"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" name="action" value="Add"/>
<input type="submit" name="action" value="Edit"/>
<input type="submit" name="action" value="Delete"/>
<input type="submit" name="action" value="Search"/>
</td>
</tr>
</table>
</form:form>
<br>
<table border="1">
<th>id</th>
<th>age</th>
<th>name</th>
<th>salary</th>
<c:forEach items="${employeeList}" var="employee">
<tr>
    <td> ${employee.id}</td>
    <td> ${employee.age}</td>
    <td> ${employee.name}</td>
    <td> ${employee.salary}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>