package com.cinema.peliculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.peliculas.modelos.Usuarios;

public interface UsuariosRepository  extends JpaRepository<Usuarios, Integer> {

    Usuarios findByNombreusuario(String nombreusuario);

    Usuarios findByNombreusuarioContrasena(String nombreusuario, String contrasena);

}
