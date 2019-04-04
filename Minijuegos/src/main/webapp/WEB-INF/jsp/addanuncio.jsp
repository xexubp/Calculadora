<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="styles/login.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<head>
<title>Añadir anuncio</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.1/css/all.css"
	integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP"
	crossorigin="anonymous">

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
		<input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="buscar" name="find" id="find">
		<button class="btn btn-success my-2 my-sm-0" type="submit">Buscar</button>
		<a style="color: #f7cfd9;">__________________________________________</a>
		<a href="/login" style="color: #d6748c;"><i class="fas fa-sign-in-alt fa-2x"></i></a>
		<a style="color: #f7cfd9;">_______</a>
		<a href="/registro" style="color: #d6748c;"><i class="fas fa-user-plus fa-2x"></i></a>
	</form>
	</nav>	
	

	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="anun_card">
					<form id="anunci" name="anunci" method="post" action="/addadd">
						<div class="input-group mb-2">
							<font size="6">Titulo</font>
						</div>
						<div class="input-group mb-3">
							<input type="text" name="titulo" id="titulo"
								class="form-control input_user" value="${tit}"
								placeholder="titulo">
						</div>
						<div class="input-group mb-3">
							<font size="6">Descripcion</font>
						</div>
						<div class="input-group mb-3">
							<textarea name="descripcion" id="descripcion" rows="10" cols="50">${descripcion}</textarea>
						</div>
						<div class="input-group mb-3">
							<font size="6">Precio</font>
						</div>
						<div class="input-group mb-3">
							<input type="text" name="precio" id="precio"
								class="form-control input_user" value="${precio}"
								placeholder="precio">
						</div>
						<div class="input-group mb-3">
							<font size="6">Prioridad</font>
						</div>
						<div class="input-group mb-3">
							<input type="text" name="prioridad" id="prioridad"
								class="form-control input_user" value="${prioridad}"
								placeholder="prioridad">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<label class="input-group-text" for="idcategoria">Categoria</label>
							</div>
							<select class="custom-select"name="idcategoria" id="idcategoria">
								<c:forEach var="c" items="${categorias}">
									<option value="${c.getIdcategoria()}">${c.getDescripcion()}</option>
								</c:forEach>
							</select>
						</div>
						 <input type="hidden" id="idcategoria" name="idcategoria" value="${idcategoria}">
						 <input type="hidden" id="idanuncio" name="idanuncio" value="${idanuncio}">
						
						<div class="input-group mb-3">
							<input type="submit" class="btn btn-primary btn-sm" name="enviar"
								value="ENVIAR"> <input type="reset"
								class="btn btn-secondary btn-sm" name="reset" value="RESET">
						</div>
					</form>
			</div>
		</div>
	</div>
</body>
</html>
