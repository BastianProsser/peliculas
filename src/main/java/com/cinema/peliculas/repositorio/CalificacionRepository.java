package com.cinema.peliculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.peliculas.modelos.Calificaciones;

public interface CalificacionRepository  extends JpaRepository<Calificaciones, Integer>{

}
