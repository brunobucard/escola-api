package com.escola.api.repository.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.Usuario;
import com.escola.api.repository.filter.UsuarioFilter;

public interface UsuarioRepositoryQuery {

	public Page<Usuario> filtrar(UsuarioFilter usuarioFilter, Pageable pageable);
}
