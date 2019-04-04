package com.example.demo.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.demo.beans.Anuncios;

public interface IAnuncioService {

	public List<Anuncios> listaranuncios();
	public List<Anuncios> listaranunciosbyprioridad();
	public List<Anuncios> listaranunciosbycategoria();


	public void borrarAnuncio(int idanuncio);
	public void addAnuncio(Anuncios anuncio);
	public Anuncios buscarid(int idanuncio);
	
	public List<Anuncios> buscarTexto(String texto);

	
}
