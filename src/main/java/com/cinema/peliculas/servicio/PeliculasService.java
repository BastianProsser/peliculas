package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.peliculas.modelos.Peliculas;

@Service
public interface PeliculasService {
	Iterable<Peliculas> getMovies();

	Peliculas getMovieById(Integer id);

}
