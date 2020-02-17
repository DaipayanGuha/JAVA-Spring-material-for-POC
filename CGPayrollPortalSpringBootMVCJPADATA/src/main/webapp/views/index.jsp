<html>
<style>
body {
	margin: 0;
	padding: 0;
	background: url(pic11.jpg);
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







.example5 {
 height: 50px;	
 overflow: hidden;
 position: relative;
}
.example5 h3 {
 position: absolute;
 width: 100%;
 height: 100%;
 margin: 0;
 line-height: 50px;
 text-align: left;
 /* Apply animation to this element */	
 -moz-animation: example5 5s linear infinite alternate;
 -webkit-animation: example5 5s linear infinite alternate;
 animation: example5 5s linear infinite alternate;
}
/* Move it (define the animation) */
@-moz-keyframes example5 {
 0%   { -moz-transform: translateX(70%); }
 100% { -moz-transform: translateX(0%); }
}
@-webkit-keyframes example5 {
 0%   { -webkit-transform: translateX(70%); }
 100% { -webkit-transform: translateX(0%); }
}
@keyframes example5 {
 0%   { 
 -moz-transform: translateX(70%); /* Firefox bug fix */
 -webkit-transform: translateX(70%); /* Firefox bug fix */
 transform: translateX(70%); 		
 }
 100% { 
 -moz-transform: translateX(0%); /* Firefox bug fix */
 -webkit-transform: translateX(0%); /* Firefox bug fix */
 transform: translateX(0%); 
 }
}
</style>
<body background="/WebContent/WEB-INF/views/pic2.jpg">
	<div align="center">
	<hr>
		<div>
			<div class="example5" style="background-color:rgba(0,0,255,0.5)">
				<h3>
					<em>       WELCOME TO CAPGEMINI PAYROLL SYSTEM     </em>
				</h3>
			</div>
		</div>
		<div style="background-color:rgba(0,0,255,0.1)">
			<h4>
				<em>   Please Select any of the following Links :  </em>
			</h4>
		</div>
	<hr>
	<hr>
	<br>
	<div align="center">
		<div class="loginbox" align="center">
			<table style="background-color: rgba(0, 0, 255, 0.1)" border="3">
				<tr style="border-width: 10px; border-style: solid; border-color: olivedrab;">
				<td>Click Here To</td>
					<td><button><a href="registration"><b><font color="magenta" size=5><br>Register
									Associate</font></b></a></button></td>
				</tr>
				<tr style="border-width: 10px; border-style: solid; border-color: olivedrab;">
				<td>Click Here To</td>
					<td><button><a href="findAssociateDetails"><b><font
								color="blue" size=5><br>Find Associate Details</font></b></a></button></td>
				</tr>
				<tr style="border-width: 10px; border-style: solid; border-color: olivedrab;">
				<td>Click Here To</td>
					<td><button><a href="FindAllAssociate"><b><font color="green"
								size=5><br>Find All Associate Details</font></b></a></button></td>
				</tr>
				<tr style="border-width: 10px; border-style: solid; border-color: olivedrab;">
				<td>Click Here To</td>
					<td><button><a href="calculateSalary"><b><font color="purple"
								size=5><br>Calculate Salary</font></b></a></button></td>
				</tr>
			</table>
		</div>
	</div>
	</div>
</body>
</html>
