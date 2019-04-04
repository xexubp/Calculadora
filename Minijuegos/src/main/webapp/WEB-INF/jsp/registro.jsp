<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="styles/login.css">

<head>
	<title>Registro</title>
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
			<div class="user_card_register">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<img src="images/logo.png" class="brand_logo" alt="Logo">
					</div>
				</div>
				<div class="d-flex justify-content-center form_container">
				<form id="registro" name="registro" method="post" action="/registrar">
					<div class="input-group mb-3">
						<span class="input-group-text"><i class="fas fa-user"></i></span>						
						<input type="text" name="usuario" id="usuario" class="form-control input_user" value="" placeholder="Usuario">
					</div>
					<div class="input-group mb-3">
						<span class="input-group-text"><i class="fas fa-key"></i></span>						
						<input type="password" name="password" id="password" class="form-control input_pass" value="" placeholder="Contraseña">
					</div>
					<div class="input-group mb-3">
						<span class="input-group-text"><i class="fas fa-key"></i></span>						
						<input type="password" name="password2" id="password2" class="form-control input_pass" value="" placeholder="Repetir Contraseña">
					</div>
					<div class="input-group mb-3">	
						<span class="input-group-text"><i class="fa fa-envelope" aria-hidden="true"></i></span>
						<input type="email" name="email" id="email" class="form-control input_user" value="" placeholder="Correo">
					</div>
					<div class="input-group mb-3">	
						<span class="input-group-text"><i class="fa fa-envelope" aria-hidden="true"></i></span>
						<input type="text" name="telefono" id="telefono" class="form-control input_user" value="" placeholder="Telefono">
					</div>
	
					
					<div class="form-group">
						<div class="custom-control custom-checkbox">
							<input type="checkbox" class="custom-control-input" id="termin" name="termin" value="aceptada">
							<label class="custom-control-label" for="termin">Aceptar Terminos y Condiciones</label>
						</div>
					</div>
					
					
					<div class="d-flex justify-content-center mt-3 login_container">
						<button type="submit" name="button" class="btn login_btn">Registrarse</button>						
					</div>
						<c:out value="${error}"></c:out>
				</form>
				
				</div>
			</div>
				
		</div>
	</div>
</body>
</html>
