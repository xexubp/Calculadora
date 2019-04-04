package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Categorias;
import com.example.demo.dao.CategoriasRepository;
import com.example.demo.interfaces.ICategoriaSERVICES;

@Service
public class CategoriaService implements ICategoriaSERVICES {
	

@Autowired
CategoriasRepository categoriasRepository;

	@Override
	public List<Categorias> listarcategorias() {

		List<Categorias> categoriassalida = new ArrayList<Categorias>();
		
		
		
		Iterable<Categorias> categorias=categoriasRepository.findAll();
		for (Categorias categoria : categorias) {
			
			categoriassalida.add(categoria);
			System.out.println(categoria);
		}
		return categoriassalida;
	}


	@Override
	public void borrarCategoria(int idcategoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCategoria(Categorias categoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public Categorias buscarid(int idcategoria) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Categorias buscarcategoria(int idcategoria) {
		
		Optional<Categorias>categoria=categoriasRepository.findById(idcategoria);
		if(categoria.isPresent())  //Si lo ha encontrado.... (es un bool)
		{
			return categoria.get();
		}
		return null; 
	}

}
