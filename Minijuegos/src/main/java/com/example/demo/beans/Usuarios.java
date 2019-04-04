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
@Table(name = "usuarios")

public class Usuarios {

	@Id // para decir cual es el PK
	@Column(name = "idusuario")
	private String idusuario;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "telefono")
	private int telefono;

	@OneToMany(cascade = CascadeType.ALL) // Con este relacionamos la tabla categoria con la tabla productos
	@JoinColumn(name = "idcategoria") // Seleccionamos el PK/dato que relaciona las tablas
	private List<Anuncios> anuncios;

	public String getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(String idusuario) {
		this.idusuario = idusuario;
	}

	public String getPass() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuarios [idusuario=" + idusuario + ", password=" + password + ", email=" + email + ", telefono=" + telefono
				+ ", anuncios=" + anuncios + "]";
	}



}
