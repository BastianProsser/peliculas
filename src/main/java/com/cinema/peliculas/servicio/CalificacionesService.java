package com.cinema.peliculas.servicio;

import java.util.List;

import com.cinema.peliculas.modelos.Calificaciones;

public interface CalificacionesService {
    	
	List<Calificaciones> getScores();
	
	Calificaciones getScoreById(Integer id);

	Calificaciones saveScore(Calificaciones calificacion);

	void deleteScore(Integer id);

}
