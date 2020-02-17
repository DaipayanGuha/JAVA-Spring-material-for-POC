<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Registration</title>
<style type="text/css">
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table>
			<form action="associateDetails" method="post">
				<tr>
					<td>Enter Associate Id</td>
					<td><input type="text" name="associateId" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
				<tr>
					<td><a href="index">||HOME||</a></td>
				</tr>
			</form>
		</table>
	</div>
	<div align="center" class="error">${errorMessage}</div>
	<br>
	<br>
	<div align="center">
		<table>
			<tr>
				<th>AssociateId</th>
				<th>FirstName</th>
				<th>LastName</th>
			</tr>
			<tr>
				<td>${associate.associateId}</td>
				<td>${associate.firstName}</td>
				<td>${associate.lastName}</td>
		</table>
	</div>
</body>
</html>