<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>
<style>
body {
	margin: 0;
	padding: 0;
	background: url(/WEB-INF/views/pic2.jpg);
	background-size: cover;
	font-family: sans-serif;
}

ul#nav_menu {
	list-style-type: none;
	margin: 0;
	padding: 0;
}

ul#nav_menu li {
	margin: 0;
	padding: 0;
}

.loginbox {
	width: 420px;
	height: 320px;
	color: #fff;
	top: 45%;
	left: 50%;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
	padding: 10px 30px;
}

h1 {
	margin: 0 0 0 0;
	padding: 0 0 1 0px;
	text-align: center;
	font-size: 22px;
}

.loginbox p {
	margin: 0;
	padding: 0;
	font-weight: bold;
}

.loginbox input {
	width: 100%;
	margin-bottom: 10px;
}

.loginbox input[type="text"], input[type="password"] {
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 30px;
	color: #fff;
	font-size: 16px;
}

.loginbox input[type="submit"] {
	border: none;
	outline: none;
	height: 40px;
	background: #fb2525;
	color: #fff;
	font-size: 18px;
	border-radius: 20px;
}

.loginbox input[type="submit"]:hover {
	cursor: pointer;
	background: #ffc107;
	color: #000;
}

.loginbox a {
	text-decoration: none;
	font-size: 12px;
	line-height: 20px;
	color: darkgrey;
}

.loginbox a:hover {
	color: #ffc107;
}
.error{color: red;
font-weight: bold; }</style>
</head>
<body>
<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table>
				<form:form action="registerAssociate" method="post" modelAttribute="associate">
					<tr>
							<td>First Name</td>
							<td><form:input path="firstName" size="30"/></td>
							<td><form:errors path="firstName" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Last Name</td>
							<td><form:input path="lastName" size="30"/></td>
							<td><form:errors path="lastName" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Department</td>
							<td><form:input path="department" size="30"/></td>
							<td><form:errors path="department" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Designation</td>
							<td><form:input path="designation" size="30"/></td>
							<td><form:errors path="designation" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Pancard</td>
							<td><form:input path="pancard" size="30"/></td>
							<td><form:errors path="pancard" cssClass="error"/></td>
					</tr>
					<tr>
							<td>EmailId</td>
							<td><form:input path="emailId" size="30"/></td>
							<td><form:errors path="emailId" cssClass="error"/></td>
					</tr>
					<tr>
							<td>yearlyInvestmentUnder80C</td>
							<td><form:input path="yearlyInvestmentUnder8oC" size="30"/></td>
							<td><form:errors path="yearlyInvestmentUnder8oC" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Account Number:</td>
							<td><form:input path="bankDetails.accountNumber" size="30"/></td>
							<td><form:errors path="bankDetails.accountNumber" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Bank Name:</td>
							<td><form:input path="bankDetails.bankName" size="30"/></td>
							<td><form:errors path="bankDetails.bankName" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Ifsc Code:</td>
							<td><form:input path="bankDetails.ifscCode" size="30"/></td>
							<td><form:errors path="bankDetails.ifscCode" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Basic Salary:</td>
							<td><form:input path="salary.basicSalary" size="30"/></td>
							<td><form:errors path="salary.basicSalary" cssClass="error"/></td>
					</tr>
					<tr>
							<td>Epf:</td>
							<td><form:input path="salary.epf" size="30"/></td>
							<td><form:errors path="salary.epf" cssClass="error"/></td>
					</tr>
					<tr>
							<td>company PF:</td>
							<td><form:input path="salary.companyPf" size="30"/></td>
							<td><form:errors path="salary.companyPf" cssClass="error"/></td>
					</tr>
					<tr>
							<td><input type="submit" value="Submit"/></td>
					</tr>
					<tr>
					<td><a href="index">||HOME||</a></td>
				</tr>
				</form:form>
		</table>
</div>
</body>
</html>