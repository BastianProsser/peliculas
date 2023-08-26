package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.peliculas.modelos.Calificaciones;
@Service
public interface CalificacionesService {
    
	Iterable<Calificaciones> getScores();
	
	Calificaciones getScoreById(Integer id);
	
	Calificaciones saveScore(Calificaciones calificacion);
	
	void deleteScore(Integer id);

}
