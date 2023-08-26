package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.peliculas.modelos.Peliculas;
import com.cinema.peliculas.repositorio.PeliculasRepository;
@Service
public class PeliculasServiceImpl implements PeliculasService {

	private PeliculasRepository peliculasRepository;
	
	@Autowired
	public void setPeliculasRepository(PeliculasRepository peliculasRepository) {
		this.peliculasRepository = peliculasRepository;
	}

	@Override
    @Transactional
	public Iterable<Peliculas> getMovies() {
		return peliculasRepository.findAll();
	}

	@Override
    @Transactional
	public Peliculas getMovieById(Integer id) {
		return peliculasRepository.findById(id).orElse(null);
	}

}
