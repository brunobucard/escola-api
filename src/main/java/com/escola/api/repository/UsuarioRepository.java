package com.escola.api.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Usuario;
import com.escola.api.repository.usuario.UsuarioRepositoryQuery;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioRepositoryQuery{

	public Optional<Usuario> findByEmail(String email);
	
	
	
}
