package com.cinema.peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.peliculas.modelos.Usuarios;
import com.cinema.peliculas.servicio.UsuariosService;

@RestController
@RequestMapping("/api/v1/usuario")
@CrossOrigin("*")
public class UserApiController {

    private final UsuariosService usuariosService;
   
    @Autowired
    public UserApiController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<Usuarios>> getUsers() {
        return ResponseEntity.ok(usuariosService.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> getUserById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(usuariosService.getUserById(id));
    }
 

    @PutMapping("/")
    public ResponseEntity<Usuarios> saveUser(@RequestBody Usuarios usuario) {
        return ResponseEntity.ok(usuariosService.SaveUser(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Integer id) {
        usuariosService.deleteUser(id);
        return ResponseEntity.ok("usuario eliminado");
    }
}