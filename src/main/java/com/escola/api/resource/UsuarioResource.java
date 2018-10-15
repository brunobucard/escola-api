package com.escola.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Usuario;
import com.escola.api.repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	//@PreAuthorize("hasAuthority('ROLE_PESQUISAR_USUARIO')")
	public List<Usuario>  listar(){
		return usuarioRepository.findAll();
	}

}
