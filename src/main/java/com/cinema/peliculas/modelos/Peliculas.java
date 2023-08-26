package com.cinema.peliculas.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Peliculas {
	@Id
	private Integer id_pelicula;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="anio_lanzamiento")
	private int anio_lanzamiento;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_genero", referencedColumnName="id_genero", insertable=false, updatable=false)
    private Generos genero;

	public Peliculas(Integer id_pelicula, String titulo, int anio_lanzamiento, Generos genero) {
		super();
		this.id_pelicula = id_pelicula;
		this.titulo = titulo;
		this.anio_lanzamiento = anio_lanzamiento;
		this.genero = genero;
	}
	

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	
	public Peliculas() {
		super();
	}

	public Integer getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Integer id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio_lanzamiento() {
		return anio_lanzamiento;
	}

	public void setAnio_lanzamiento(int anio_lanzamiento) {
		this.anio_lanzamiento = anio_lanzamiento;
	}
	

	
	
}
