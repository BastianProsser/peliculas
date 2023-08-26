package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.peliculas.modelos.Generos;
import com.cinema.peliculas.repositorio.GenerosRepository;
@Service
public class GenerosServiceImpl implements GenerosService {
	@Autowired
	private GenerosRepository generosRepository;
	
	@Autowired
	public void setGenerosRepository() {
		this.generosRepository = generosRepository;
	}
	
	
	@Override
    @Transactional
	public Iterable<Generos> getGenres() {
		return generosRepository.findAll();
	}

	@Override
    @Transactional
	public Generos getGenreById(Integer id) {
		return generosRepository.findById(id).orElse(null);
	}

}
