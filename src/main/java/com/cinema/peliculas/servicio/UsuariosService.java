package com.cinema.peliculas.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cinema.peliculas.modelos.Usuarios;
@Service
public interface UsuariosService {
	
	Iterable<Usuarios> getUsers();
    
    Usuarios getUserById(Integer id);
    
    Usuarios SaveUser(Usuarios usuario);
    
    void deleteUser(Integer id);

}
