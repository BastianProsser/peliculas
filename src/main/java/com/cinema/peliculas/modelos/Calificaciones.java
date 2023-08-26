package com.cinema.peliculas.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificaciones")
public class Calificaciones {
	@Id
	private Integer id_calificacion;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pelicula")
    private Peliculas pelicula;
	
	private int puntuacion;
	
	private String resena;

	public Calificaciones(Integer id_calificacion, Usuarios usuario, Peliculas pelicula, int puntuacion,
			String resena) {
		super();
		this.id_calificacion = id_calificacion;
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.puntuacion = puntuacion;
		this.resena = resena;
	}

	public Calificaciones() {
		super();
	}

	public Integer getId_calificacion() {
		return id_calificacion;
	}

	public void setId_calificacion(Integer id_calificacion) {
		this.id_calificacion = id_calificacion;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getResena() {
		return resena;
	}

	public void setResena(String resena) {
		this.resena = resena;
	}
	
	
	
	
	
	
}	


