package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.peliculas.modelos.Generos;
@Service
public interface GenerosService {
	
    Iterable<Generos> getGenres();
    
    Generos getGenreById(Integer id);
   

}
