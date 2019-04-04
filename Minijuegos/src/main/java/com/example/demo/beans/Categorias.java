package com.example.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categorias {

	
	@Id //para decir cual es el PK
	@Column(name="idcategoria")
	private int idcategoria;
	
	@Column(name="descripcion")
	private String descripcion;


	@OneToMany(cascade=CascadeType.ALL)  //Con este relacionamos la tabla categoria con la tabla productos
	@JoinColumn(name="idcategoria")   //Seleccionamos el PK/dato que relaciona las tablas
	private List<Anuncios> anuncios;   //Vector list de productos unido con la tabla categoria
	
	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Anuncios> getAnuncios() {
		return anuncios;
	}

	public void setAnuncios(List<Anuncios> anuncios) {
		this.anuncios = anuncios;
	} 

	
	
	
	
	
}
