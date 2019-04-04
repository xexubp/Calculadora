package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.Anuncios;
import com.example.demo.beans.Usuarios;
import com.example.demo.interfaces.IAnuncioService;
import com.example.demo.interfaces.ICategoriaSERVICES;
import com.example.demo.interfaces.IUsuarioService;

@Controller
public class ControladorUser {

	@Autowired
	IUsuarioService usuarioservice;
	@Autowired
	IAnuncioService anuncioservice;
	@Autowired
	ICategoriaSERVICES categoriaSERVICES;

	@RequestMapping("/registro") // listamos las categorias, serie una especie de Servlet...
	public String inicio2(HttpServletRequest request) {

		return "registro"; // señala a los jsp

	}

	@RequestMapping("/login")
	public String login0(HttpServletRequest request) {

		return "login"; // señala a los jsp

	}

	@RequestMapping("/addanuncio")
	public String addanuncio(HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("categorias", categoriaSERVICES.listarcategorias());

		return "addanuncio"; // señala a los jsp

	}

	@RequestMapping("/modificar")
	public String modificar(HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);

		int idanuncio = Integer.parseInt(request.getParameter("idanuncio"));
		Anuncios anun = anuncioservice.buscarid(idanuncio);
		sesion.setAttribute("categorias", categoriaSERVICES.listarcategorias());

		request.setAttribute("tit", anun.getTitulo());
		request.setAttribute("descripcion", anun.getDescripcion());
		request.setAttribute("precio", anun.getPrecio());
		request.setAttribute("prioridad", anun.getPrioridad());
		request.setAttribute("idcategoria", anun.getIdcategoria());
		request.setAttribute("nombreUsuario", anun.getIdusuario());
		request.setAttribute("idanuncio", anun.getIdanuncio());

		return "addanuncio"; // señala a los jsp

	}

	@RequestMapping("/eliminar")
	public String eliminar(HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);
		int idanuncio = Integer.parseInt(request.getParameter("idanuncio"));
		anuncioservice.borrarAnuncio(idanuncio);

		List<Anuncios> anunuser = usuarioservice.listaranunciosbyusuario((String) sesion.getAttribute("nombreUsuario"));

		sesion.setAttribute("listaUsuario", anunuser);

		return "anunciosusuario"; // señala a los jsp

	}

	@RequestMapping("/addadd")
	public String addadd(HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);

		String titulo = request.getParameter("titulo");
		String descripcion = request.getParameter("descripcion");
		double precio = Double.parseDouble(request.getParameter("precio"));
		int prioridad = Integer.parseInt(request.getParameter("prioridad"));
		int idcategoria = Integer.parseInt(request.getParameter("idcategoria"));
		// int idanuncio = Integer.parseInt(request.getParameter("idanuncio"));
		String idanuncio = request.getParameter("idanuncio");
		String nombre = (String) sesion.getAttribute("nombreUsuario");
		if (idanuncio.equals("")) {
			Anuncios anun = new Anuncios();

			anun.setTitulo(titulo);
			anun.setDescripcion(descripcion);
			anun.setPrecio(precio);
			anun.setPrioridad(prioridad);
			anun.setIdcategoria(idcategoria);
			anun.setIdusuario(nombre);
			anuncioservice.addAnuncio(anun);

		} else {
			Anuncios anun = anuncioservice.buscarid(Integer.parseInt(idanuncio));

			anun.setTitulo(titulo);
			anun.setDescripcion(descripcion);
			anun.setPrecio(precio);
			anun.setPrioridad(prioridad);
			anun.setIdcategoria(idcategoria);
			anun.setIdanuncio(Integer.parseInt(idanuncio));
			anun.setIdusuario(nombre);
			anuncioservice.addAnuncio(anun);
		}

		List<Anuncios> anunuser = usuarioservice.listaranunciosbyusuario((String) sesion.getAttribute("nombreUsuario"));

		sesion.setAttribute("listaUsuario", anunuser);

		return "anunciosusuario"; // señala a los jsp

	}

	@RequestMapping("/log")
	public String login1(HttpServletRequest request) {
		HttpSession sesion1 = request.getSession(true);
		sesion1.invalidate();
		HttpSession sesion = request.getSession(true);

		String nombre = request.getParameter("usuario");
		String password = request.getParameter("password");
		Usuarios user = usuarioservice.buscarid(nombre);

		if (user.getPass().equals(password)) {
			sesion.setAttribute("nombreUsuario", nombre);
			List<Anuncios> anunuser = usuarioservice
					.listaranunciosbyusuario((String) sesion.getAttribute("nombreUsuario"));

			sesion.setAttribute("listaUsuario", anunuser);

			return "anunciosusuario";
		}
		sesion.setAttribute("nombreUsuario", nombre);

		return "login";

	}

	@RequestMapping("/registrar") // listamos las categorias, serie una especie de Servlet...
	public String registrar(HttpServletRequest request) {
		HttpSession sesion = request.getSession(true);

		String nombre = request.getParameter("usuario");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String termin = request.getParameter("termin");

		if (termin != null) {
			if (password.equals(password2)) {
				Usuarios usuario = new Usuarios();
				usuario.setIdusuario(nombre);
				usuario.setPassword(password);
				usuario.setEmail(email);
				usuario.setTelefono(telefono);

				System.out.println(usuario);

				usuarioservice.addUsuario(usuario);
				sesion.setAttribute("nombreUsuario", nombre);

				return "index"; // señala a los jsp
			} else {
				request.setAttribute("error", "Las contraseñas no coinciden");
			}
		} else {
			request.setAttribute("error", "Acepte los terminos y condiciones");
		}
		return "registro";

	}

}
