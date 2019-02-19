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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.event.RecursoCriadoEvent;
import com.escola.api.model.Disciplina;
import com.escola.api.model.Turma;
import com.escola.api.repository.DisciplinaRepository;
import com.escola.api.repository.filter.DisciplinaFilter;
import com.escola.api.repository.filter.TurmaFilter;
import com.escola.api.service.DisciplinaService;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaResource {

	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Autowired
	private DisciplinaService disciplinaService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public Page<Disciplina> pesquisar(DisciplinaFilter disciplinaFilter, Pageable pageable) {
		return disciplinaRepository.filtrar(disciplinaFilter, pageable);
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_DISCIPLINA') and #oauth2.hasScope('write')")
	public ResponseEntity<Disciplina> criar(@Valid @RequestBody Disciplina disciplina, HttpServletResponse response) {
		Disciplina disciplinaSalva = disciplinaRepository.save(disciplina);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, disciplinaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_DISCIPLINA') and #oauth2.hasScope('read')")
	public ResponseEntity<Disciplina> buscaPeloCodigo(@PathVariable Long codigo) {
		Disciplina disciplina = disciplinaRepository.findOne(codigo);
		return disciplina != null ? ResponseEntity.ok(disciplina) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_DISCIPLINA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		disciplinaRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_DISCIPLINA') and #oauth2.hasScope('write')")
	public ResponseEntity<Disciplina> atualizar(@PathVariable Long codigo, @Valid @RequestBody Disciplina disciplina) {
		Disciplina disciplinaSalva = disciplinaService.atualizar(codigo, disciplina);
		return ResponseEntity.ok(disciplinaSalva);
	}
}
