<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<link rel="stylesheet" type="text/css" href="styles/login.css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    
<head>
	<title>Login</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
	
</head>

<body>
	<nav class="navbar navbar-light" style="background-color: #f7cfd9;">
	  <a class="navbar-brand" href="/">
		<i class="fas fa-shopping-basket  fa-2x"></i> 
			<b><font size="4">Mi Vibbo
			  	| Bienvenido <c:out value="${nombreUsuario}"></c:out>|
			</font></b>
	  </a>
	<form class="form-inline my-2 my-lg-0">
		<a href="/login" style="color: #d6748c;"><i class="fas fa-sign-in-alt fa-2x"></i></a>
		<a style="color: #f7cfd9;">_______</a>
		<a href="/registro" style="color: #d6748c;"><i class="fas fa-user-plus fa-2x"></i></a>
	</form>
	</nav>	

	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img src="images/logo.png" class="brand_logo" alt="Logo">
					</div>
				</div>
				<div class="d-flex justify-content-center form_container">
					<form id="login" name="login" method="post" action="log">
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="usuario" id="usuario" class="form-control input_user" value="" placeholder="Usuario">
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password" id="password" class="form-control input_pass" value="" placeholder="Contraseña">
						</div>
						<div class="form-group">
							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input" id="customControlInline" value="recordar">
								<label class="custom-control-label" for="customControlInline">Recordarme</label>
							</div>
						</div>
						<div class="d-flex justify-content-center mt-3 login_container">
							<button type="submit" name="button" class="btn login_btn">Login</button>
						</div>
					<div class="mt-4">
						<div class="d-flex justify-content-center links">
							¿Aun no tienes una cuenta? <a href="registro.jsp" class="ml-2">Registrarse</a>
						</div>
						<div class="d-flex justify-content-center links">
							<a href="#">¿Has olvidado tu contraseña?</a>
						</div>
							<c:out value="${error}"></c:out>
					</div>
				</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
