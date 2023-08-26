package com.cinema.peliculas.servicio;

import java.util.List;

import com.cinema.peliculas.modelos.Usuarios;

public interface UsuariosService {

    Usuarios getUserById(Integer id);

    Usuarios getUserByName(String nombre);

    Usuarios SaveUser(Usuarios usuario);

    void eliminarUsuario(Long id);

    List<Usuarios> getUsers();

    Usuarios Login(String nombre, String contrasena);
}
