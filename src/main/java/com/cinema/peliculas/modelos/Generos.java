package com.cinema.peliculas.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "generos")
public class Generos {
	@Id
	private Integer id_genero;
	
	@Column(name="nombre_genero")
	private String nombre_genero;

	public Generos(Integer id_genero, String nombre_genero) {
		super();
		this.id_genero = id_genero;
		this.nombre_genero = nombre_genero;
	}

	public Generos() {
		super();
	}

	public Integer getId_genero() {
		return id_genero;
	}

	public void setId_genero(Integer id_genero) {
		this.id_genero = id_genero;
	}

	public String getNombre_genero() {
		return nombre_genero;
	}

	public void setNombre_genero(String nombre_genero) {
		this.nombre_genero = nombre_genero;
	}
	
	
}
