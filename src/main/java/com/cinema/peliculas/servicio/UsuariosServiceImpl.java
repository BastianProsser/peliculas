package com.cinema.peliculas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.peliculas.modelos.Usuarios;
import com.cinema.peliculas.repositorio.UsuariosRepository;
@Service
public class UsuariosServiceImpl implements UsuariosService {
	private UsuariosRepository usuariosRepository;
	
	@Autowired
	public void setUsuariosRepository(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	
	@Override
    @Transactional
	public Iterable<Usuarios> getUsers() {
		return usuariosRepository.findAll();
	}

	@Override
    @Transactional
	public Usuarios getUserById(Integer id) {
		return usuariosRepository.findById(id).orElse(null);
	}


	@Override
    @Transactional
	public Usuarios SaveUser(Usuarios usuario) {
		return usuariosRepository.save(usuario);
	}

	@Override
    @Transactional
	public void deleteUser(Integer id) {
		usuariosRepository.deleteById(id);
	}

}
