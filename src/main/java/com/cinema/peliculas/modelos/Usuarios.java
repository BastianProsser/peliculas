package com.cinema.peliculas.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuarios {
	@Id
	private Integer id_usuario;
	
	private String nombreusuario;
	
	private String correoelectronico;

	private String contrasena;

	public Usuarios(Integer id_usuario, String nombreusuario, String correoelectronico, String contrasena) {
		super();
		this.id_usuario = id_usuario;
		this.nombreusuario = nombreusuario;
		this.correoelectronico = correoelectronico;
		this.contrasena = contrasena;
	}
	
	public Usuarios() {
		super();
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	
}
