package com.cinema.peliculas.servicio;

import java.util.List;

import com.cinema.peliculas.modelos.Peliculas;

public interface PeliculasService {
	
	   Peliculas getMovieByName(String nombre);
	   
	   Peliculas getMovieById(Integer id);

	   List<Peliculas> getMovies();


}
