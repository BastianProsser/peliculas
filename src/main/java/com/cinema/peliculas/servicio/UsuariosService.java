package com.cinema.peliculas.servicio;

import java.util.List;

import com.cinema.peliculas.modelos.Usuarios;

public interface UsuariosService {
    List<Usuarios> getUsers();

    Usuarios getUserById(Integer id);

    Usuarios getUserByName(String nombre);

    Usuarios SaveUser(Usuarios usuario);

    void eliminarUsuario(Integer id);

    Usuarios login(String nombre, String contrasena);
}
