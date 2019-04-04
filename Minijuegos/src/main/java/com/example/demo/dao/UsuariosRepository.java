package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.Categorias;
import com.example.demo.beans.Usuarios;


public interface UsuariosRepository extends CrudRepository<Usuarios, String>{

	

}
