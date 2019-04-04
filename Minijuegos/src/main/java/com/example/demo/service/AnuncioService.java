package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Anuncios;
import com.example.demo.beans.Usuarios;
import com.example.demo.dao.AnunciosRepository;
import com.example.demo.interfaces.IAnuncioService;

@Service
public class AnuncioService implements IAnuncioService {

	@Autowired
	AnunciosRepository anunciosRepository;

	@Override
	public List<Anuncios> listaranuncios() {
		List<Anuncios> anunciosalida = new ArrayList<Anuncios>();

		Iterable<Anuncios> anuncios = anunciosRepository.findAll();
		for (Anuncios anuncios2 : anuncios) {
			anunciosalida.add(anuncios2);
			System.out.println(anuncios2);
		}

		return anunciosalida;
	}

	@Override
	public List<Anuncios> listaranunciosbyprioridad() {
		List<Anuncios> anunciosalida = new ArrayList<Anuncios>();

		Iterable<Anuncios> anuncios = anunciosRepository.findAll();

		for (Anuncios anuncios2 : anuncios) {

			if (anuncios2.getPrioridad() == 1) {

				anunciosalida.add(anuncios2);
				System.out.println(anuncios2);
			}

		}

		return anunciosalida;

	}

	@Override
	public List<Anuncios> listaranunciosbycategoria() {

		List<Anuncios> anunciosalida = new ArrayList<Anuncios>();

		return null;
	}

	@Override
	public void borrarAnuncio(int idanuncio) {
		anunciosRepository.deleteById(idanuncio);
	}

	@Override
	public void addAnuncio(Anuncios anuncio) {
		anunciosRepository.save(anuncio);

	}

	@Override
	public Anuncios buscarid(int idanuncio) {
		Optional<Anuncios>anun=anunciosRepository.findById(idanuncio);
		if(anun.isPresent()){
			return anun.get();
		}
		return null; 
	}

	@Override
	public List<Anuncios> buscarTexto(String texto) {
		List<Anuncios> op=anunciosRepository.findPorTexto(texto);
		System.out.println(op);
		return op;
	}
}



