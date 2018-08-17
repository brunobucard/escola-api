package com.escola.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Aluno;
import com.escola.api.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public Page<Aluno> pesquisar(@RequestParam(required = false, defaultValue = "%") String nome, Pageable pageable){
		return alunoRepository.findByNomeContaining(nome, pageable);
	}

}
