package com.cinema.peliculas.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.cinema.peliculas.modelos.Usuarios;

public interface UsuariosRepository  extends CrudRepository<Usuarios, Integer> {

	/*
	 * Usuarios findByUsername(String nombreusuario);
	 * 
	 * Usuarios findByUserData(String nombreusuario, String contrasena);
	 */

}
