package com.cinema.peliculas.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.cinema.peliculas.modelos.Peliculas;

public interface PeliculasRepository extends CrudRepository<Peliculas, Integer> {

	/* Peliculas findByTitle(String titulo); */
}
