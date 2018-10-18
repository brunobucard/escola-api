package com.escola.api.resource;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.event.RecursoCriadoEvent;
import com.escola.api.model.Aluno;
import com.escola.api.repository.AlunoRepository;
import com.escola.api.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_ALUNO') and #oauth2.hasScope('write')")
	public ResponseEntity<Aluno> criar(@Valid @RequestBody Aluno aluno, HttpServletResponse response) {
		Aluno alunoSalvo = alunoRepository.save(aluno);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, alunoSalvo.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(alunoSalvo);
	}
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_ALUNO')")
	public Page<Aluno> pesquisar(@RequestParam(required = false, defaultValue = "%") String nome, Pageable pageable){
		return alunoRepository.findByNomeContaining(nome, pageable);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_ALUNO') and #oauth2.hasScope('read')")
	public ResponseEntity<Aluno> buscarPeloCodigo(@PathVariable Long codigo) {
		Aluno aluno = alunoRepository.findOne(codigo);
		return aluno != null ? ResponseEntity.ok(aluno) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_ALUNO') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		alunoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_ALUNO') and #oauth2.hasScope('write')")
	public ResponseEntity<Aluno> atualizar(@PathVariable Long codigo, @Valid @RequestBody Aluno aluno) {
		Aluno alunoSalvo = alunoService.atualizar(codigo, aluno);
		return ResponseEntity.ok(alunoSalvo);
	}

}
