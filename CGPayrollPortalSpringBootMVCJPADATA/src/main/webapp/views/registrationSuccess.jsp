<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
	<head>
	<style>
body{
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
			
		ul#nav_menu li { margin: 0; padding: 0; }
.loginbox{
    width: 420px;
    height: 320px;
    color: #fff;
    top: 45%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 10px 30px;
}


h1{
    margin:0 0 0 0;
    padding: 0 0 1 0px;
    text-align: center;
    font-size: 22px;
}

.loginbox p{
    margin: 0;
    padding: 0;
    font-weight: bold;
}

.loginbox input{
    width: 100%;
    margin-bottom: 10px;
}

.loginbox input[type="text"], input[type="password"]
{
    border: none;
    border-bottom: 1px solid #fff;
    background: transparent;
    outline: none;
    height: 30px;
    color: #fff;
    font-size: 16px;
}
.loginbox input[type="submit"]
{
	
    border: none;
    outline: none;
    height: 40px;
    background: #fb2525;
    color: #fff;
    font-size: 18px;
    border-radius: 20px;
}
.loginbox input[type="submit"]:hover
{
    cursor: pointer;
    background: #ffc107;
    color: #000;
}
.loginbox a{
    text-decoration: none;
    font-size: 12px;
    line-height: 20px;
    color: darkgrey;
}

.loginbox a:hover
{
    color: #ffc107;
}


</style>
		<title>Welcome</title>
	</head>
	<body>
			<div align="center">
					<h2>Welcome ${associate.firstName}&nbsp; &nbsp; ${associate.lastName} your Registration is done Successfully</h2>
					<h2>Associate Id :- ${associate.associateId}</h2>
					<tr>
					<td><a href="index">||HOME||</a></td>
				</tr>
			</div>
	</body>
</html>