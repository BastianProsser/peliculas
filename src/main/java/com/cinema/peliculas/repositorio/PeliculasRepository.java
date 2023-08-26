package com.cinema.peliculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.peliculas.modelos.Peliculas;

public interface PeliculasRepository extends JpaRepository<Peliculas, Integer> {

    Peliculas findByTitulo(String titulo);
}
