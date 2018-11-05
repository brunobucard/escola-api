package com.escola.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.escola.api.model.Usuario;
import com.escola.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Usuario novoUsuario(Usuario usuario) {
		//Usuario usuarioSalvo;
		//usuarioSalvo.setSenha(passwordEncoder.encode(usuario.getSenha()));
		usuario.setSenha("senha");
		return usuarioRepository.save(usuario);
	}
	
	
	

}
