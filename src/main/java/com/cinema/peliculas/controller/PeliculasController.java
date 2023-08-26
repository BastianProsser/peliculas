package com.cinema.peliculas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cinema.peliculas.modelos.Peliculas;
import com.cinema.peliculas.servicio.PeliculasService;

@Controller
public class PeliculasController {
	private PeliculasService peliculasService;


	public PeliculasService getPeliculasService() {
		return peliculasService;
	
	}

	@Autowired
	public void setPeliculasService(PeliculasService peliculasService) {
		this.peliculasService = peliculasService;
	}


	@GetMapping("/peliculas")
	public String listarPeliculas(Model model) {
		Iterable<Peliculas> listaPeliculas = peliculasService.getMovies();
		model.addAttribute("listaPeliculas", listaPeliculas);
		return "peliculas";
	}
	
}
