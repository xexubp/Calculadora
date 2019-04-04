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
	<title>Busqueda</title>
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
	  
	<form class="form-inline my-2 my-lg-0" id="buscar" name="buscar" method="post" action="/buscar">
		<a href="/" style="color: #000000;"><i class="fas fa-caret-square-left fa-3x"></i></a>
		<a style="color: #f7cfd9;">_______</a>
		<input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="buscar" name="find" id="find">
		<button class="btn btn-success my-2 my-sm-0" type="submit">Buscar</button>
		<a style="color: #f7cfd9;">__________________________________________</a>
		<a href="/login" style="color: #d6748c;"><i class="fas fa-sign-in-alt fa-2x"></i></a>
		<a style="color: #f7cfd9;">_______</a>
		<a href="/registro" style="color: #d6748c;"><i class="fas fa-user-plus fa-2x"></i></a>
	</form>
	</nav>	
	
	
	<div class="container">
		<table class="table table-shadow" style="background-color: #d6748c">
			<thead>
				<tr>
					<th>Prior</th>
					<th>Titulo</th>
					<th>Descripcion</th>
					<th>Precio Total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${busquedaAnun}">
					<tr>
						<td>${c.getPrioridad()}</td>
						<td>${c.getTitulo()}</td>
						<td>${c.getDescripcion()}</td>
						<td>${c.getPrecio()}<i class="fas fa-euro-sign"></i></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>
</body>
</html>