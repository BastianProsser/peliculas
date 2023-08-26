package com.cinema.peliculas.servicio;

import java.util.List;

import com.cinema.peliculas.modelos.Generos;

public interface GenerosService {
	
    List<Generos> getGenres();
    
	Generos getGenreById(Integer id);
   

}
