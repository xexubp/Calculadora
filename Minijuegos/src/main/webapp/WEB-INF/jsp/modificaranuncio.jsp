<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar anuncio</title>
</head>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css">
<%@page import="java.util.Date"%>

<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<nav class="navbar navbar-light" style="background-color: #f7cfd9;">
	  <a class="navbar-brand" href="/">
		<i class="fas fa-shopping-basket  fa-2x"></i> 
			<b><font size="4">Mi Vibbo
			  	| Bienvenido <c:out value="${nombreUsuario}"></c:out>|
			</font></b>
	  </a>
	  
	<form class="form-inline my-2 my-lg-0" id="buscar" name="buscar" method="post" action="/buscar">
		<input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="buscar" name="find" id="find">
		<button class="btn btn-success my-2 my-sm-0" type="submit">Buscar</button>
		<a style="color: #f7cfd9;">__________________________________________</a>
		<a href="/login" style="color: #d6748c;"><i class="fas fa-sign-in-alt fa-2x"></i></a>
		<a style="color: #f7cfd9;">_______</a>
		<a href="/registro" style="color: #d6748c;"><i class="fas fa-user-plus fa-2x"></i></a>
	</form>
	</nav>	
	

	<form class="form-signin" id="registrar" name="registrar" method="post"
		action="/addadd">
		<div class="form-group row">
			<label for="titulo" class="col-sm-12 col-form-label">
				<h3>
					<b>Titulo</b>
				</h3>
			</label>
			<div class="col-sm-15">
				<input type="text" class="form-control" name="titulo" id="titulo"
					placeholder="Introduzca un Titulo" value="${titulo}">
			</div>
			<br>
		</div>
		<div class="form-group row">
			<label for="descripcion" class="col-sm-12 col-form-label">
				<h3>
					<b>Descripcion</b>
				</h3>
			</label>
			<div class="col-sm-15">
				<textarea name="descripcion" id="descripcion" rows="10" cols="30"></textarea>
			</div>
			<br>
		</div>
		<div class="form-group row">
			<label for="precio" class="col-sm-12 col-form-label">
				<h3>
					<b>Precio</b>
				</h3>
			</label>
			<div class="col-sm-15">
				<input type="text" class="form-control" name="precio" id="precio"
					placeholder="Introduzca precio">
			</div>
		</div>
		<div class="form-group row">
			<label for="telefono" class="col-sm-12 col-form-label">
				<h3>
					<b>Prioridad (1-3)</b>
				</h3>
			</label>
			<div class="col-sm-15">
				<input type="text" class="form-control" name="prioridad"
					id="prioridad" placeholder="Introduzca prioridad (1-3)">
			</div>
		</div>
		<div class="form-group row">

			<select name="idcategoria" id="idcategoria">
				<c:forEach var="c" items="${categorias}">
					<option value="${c.getIdcategoria()}">${c.getDescripcion()}</option>
				</c:forEach>

			</select>
		</div>

		<input type="submit" class="btn btn-primary btn-sm" name="enviar"
			value="ENVIAR"> <input type="reset"
			class="btn btn-secondary btn-sm" name="reset" value="RESET">

		<br>



	</form>


</body>
</html>