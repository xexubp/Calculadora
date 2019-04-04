package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="anuncios")
public class Anuncios {
	
	@Id
	@Column(name="idanuncio")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int idanuncio;
	
	@Column(name="idcategoria")
	private int idcategoria;
	
	@Column(name="idusuario")
	private String idusuario;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="prioridad")
	private int prioridad;
	
	@Column(name="descripcion")
	private String descripcion;
	


	public int getIdanuncio() {
		return idanuncio;
	}

	public void setIdanuncio(int idanuncio) {
		this.idanuncio = idanuncio;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Anuncios [idanuncio=" + idanuncio + ", idcategoria=" + idcategoria + ", idusuario=" + idusuario
				+ ", titulo=" + titulo + ", precio=" + precio + ", prioridad=" + prioridad + ", descripcion="
				+ descripcion + "]";
	}
	
	
	

}
