package com.cinema.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.peliculas.modelos.Peliculas;
import com.cinema.peliculas.servicio.PeliculasService;

@RestController
@RequestMapping("/api/v1/peliculas")
@CrossOrigin("*")
public class MoviesApiController {

    private final PeliculasService peliculasService;

    @Autowired
    public MoviesApiController(PeliculasService peliculasService) {
        this.peliculasService = peliculasService;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<Peliculas>> listAllMovies() {
        return ResponseEntity.ok(peliculasService.getMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Peliculas> getMovieById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(peliculasService.getMovieById(id));
    }

 


}