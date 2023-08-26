package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.peliculas.modelos.Calificaciones;
import com.cinema.peliculas.repositorio.CalificacionRepository;
@Service
public class CalificacionesServiceImpl implements CalificacionesService {
	@Autowired
	private CalificacionRepository calificacionRepository;
	
	@Autowired
	public void setCalificacionesServiceImpl(CalificacionRepository calificacionRepository) {
		this.calificacionRepository = calificacionRepository;
	}
	
	@Override
    @Transactional
	public Iterable<Calificaciones> getScores() {
		return calificacionRepository.findAll();
	}

	@Override
    @Transactional
	public Calificaciones getScoreById(Integer id) {
		return calificacionRepository.findById(id).orElse(null);
	}

	@Override
    @Transactional
	public Calificaciones saveScore(Calificaciones calificacion) {
		return calificacionRepository.save(calificacion);
	}

	@Override
    @Transactional
	public void deleteScore(Integer id) {
		calificacionRepository.deleteById(id);
	}

}
