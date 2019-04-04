package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.Anuncios;
import com.example.demo.beans.Categorias;
import com.example.demo.interfaces.IAnuncioService;
import com.example.demo.interfaces.ICategoriaSERVICES;

@Controller
public class Controlador {

	@Autowired
	ICategoriaSERVICES categoriaSERVICES;

	@Autowired
	IAnuncioService anuncioservice;

	@RequestMapping("/") // listamos las categorias, serie una especie de Servlet...
	public String inicio(HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);
		sesion.setAttribute("nombreUsuario", "");
		sesion.setAttribute("categorias", categoriaSERVICES.listarcategorias());
		sesion.setAttribute("anuncios", anuncioservice.listaranunciosbyprioridad());

		return "index"; // señala a los jsp
	}

	@RequestMapping("/deletecategoria")
	public String inicio2(HttpServletRequest request) {
		int idcategoria = Integer.parseInt(request.getParameter("idcategoria"));
		System.out.println(idcategoria);

		anuncioservice.listaranunciosbycategoria();

		return "index";
	}


	@RequestMapping("/listar")
	public String listar(HttpServletRequest request) {

		int idcategoria = Integer.parseInt(request.getParameter("idcategoria")); // se le asigna a "numcta" el dato del
																					// "href" pulsado
		Categorias categoria = categoriaSERVICES.buscarcategoria(idcategoria); // Se busca la cuenta elegida y se guarda
																				// en objeto cuenta

		request.setAttribute("lista", categoria.getAnuncios()); // llama a la lista que contiene cuenta con todos los
																// movimientos (Lista en beans.cuenta)

		return "listar";

	}
	@RequestMapping("/buscar")
	public String buscar(HttpServletRequest request) {
		
		String texto = request.getParameter("find");
		System.out.println(texto);
		List<Anuncios> busquedaAnun=anuncioservice.buscarTexto(texto);
		System.out.println(busquedaAnun);
		request.setAttribute("busquedaAnun", busquedaAnun);
		return "busqueda";
	}
}
