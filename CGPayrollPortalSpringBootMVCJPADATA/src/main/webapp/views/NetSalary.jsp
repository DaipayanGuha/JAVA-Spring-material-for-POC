<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table>
			<form action="calculate" method="post">
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
				<th>Calculate Salary</th>
				
			</tr>
			<tr>
				<td>${associate.salary.netSalary}</td>
				
		</table>
	</div>
</body>
</body>
</html>