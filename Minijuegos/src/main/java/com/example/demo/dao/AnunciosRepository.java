package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.beans.Anuncios;


public interface AnunciosRepository  extends CrudRepository<Anuncios, Integer>{
	@Query(value="SELECT * FROM vibbo.anuncios WHERE titulo LIKE %:texto% OR descripcion LIKE %:texto%", nativeQuery=true)
	public List<Anuncios> findPorTexto(@Param("texto") String texto);
}
