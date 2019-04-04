package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Anuncios;
import com.example.demo.beans.Usuarios;
import com.example.demo.dao.AnunciosRepository;
import com.example.demo.dao.UsuariosRepository;
import com.example.demo.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

@Autowired
UsuariosRepository usuarioRepository;

@Autowired
AnunciosRepository anunciosRepository;

	@Override
	
	public List<Usuarios> listarusuarios() {
		
		return null;
	}

	@Override
	public void borrarusuario(String idusuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUsuario(Usuarios usuario) {
		
		usuarioRepository.save(usuario);

	}

	@Override
	public Usuarios buscarid(String idusuario) {
		Optional<Usuarios>user=usuarioRepository.findById(idusuario);
		System.out.println(user);
		if(user.isPresent()){
			return user.get();
		}
		return null; 
	}
	@Override
	
	public List<Anuncios> listaranunciosbyusuario(String idusuario) {
		List<Anuncios> anunciosalida = new ArrayList<Anuncios>();

		Iterable<Anuncios> anuncios = anunciosRepository.findAll();
		for (Anuncios anuncios2 : anuncios) {

			if (anuncios2.getIdusuario().equals(idusuario)) {

				anunciosalida.add(anuncios2);

			}

		}

		return anunciosalida;

	}

}
