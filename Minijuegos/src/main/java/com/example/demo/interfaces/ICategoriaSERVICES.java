package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.beans.Categorias;

public interface ICategoriaSERVICES {
	
	public List<Categorias> listarcategorias();
	public void borrarCategoria(int idcategoria);
	public void addCategoria(Categorias categoria);
	public Categorias buscarid(int idcategoria);
	public Categorias buscarcategoria(int idcategoria);

}
