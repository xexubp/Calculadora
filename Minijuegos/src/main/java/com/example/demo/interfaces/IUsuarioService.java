package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Anuncios;
import com.example.demo.beans.Categorias;
import com.example.demo.beans.Usuarios;

public interface IUsuarioService {
	
	public List<Usuarios> listarusuarios();
	public void borrarusuario(String idusuario);
	public void addUsuario(Usuarios usuario);
	public Usuarios buscarid(String idusuario);
	List<Anuncios> listaranunciosbyusuario(String idusuario);
	
}
