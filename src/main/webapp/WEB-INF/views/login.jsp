<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
<title>Your Credentials?</title>
<link href="/resources/bootstrap-3.0.3/css/bootstrap.css" type="text/css" rel="stylesheet">
<link href="/resources/signin/signin.css" type="text/css" rel="stylesheet">
<style>
	.errorblock {
		color: #ff0000;
		background-color: #ffEEEE;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;
	}
</style>
</head>
<body onload='document.f.j_username.focus();'>
	
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Cause:
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	
	<div class="container">
	
	<form name='f' action="<c:url value='j_spring_security_check' />" method='POST' class="form-signin" role="form">
		<h2 class="form-signin-heading">Welcome, Your Credentials Please?</h2>
	<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value='' class="form-control" placeholder="User Name" required autofocus></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' class="form-control" placeholder="Password" required/></td>
			</tr>
			<tr>
				<td colspan='2'><button class="btn btn-lg btn-primary btn-block" name="submit" type="submit">Sign In</button></td>
			</tr>
			<tr>
				<td colspan='2'><button class="btn btn-lg btn-primary btn-block" name="reset" type="reset">Reset</button></td>
			</tr>
	</table>
 
	</form>
	</div>

</body>
</html>