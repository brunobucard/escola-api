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
import com.escola.api.model.Responsavel;
import com.escola.api.model.Turma;
import com.escola.api.repository.TurmaRepository;
import com.escola.api.repository.filter.ResponsavelFilter;
import com.escola.api.repository.filter.TurmaFilter;
import com.escola.api.service.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaResource {
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	@Autowired
	private TurmaService turmaService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public Page<Turma> pesquisar(TurmaFilter turmaFilter, Pageable pageable) {
		return turmaRepository.filtrar(turmaFilter, pageable);
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_TURMA') and #oauth2.hasScope('write')")
	public ResponseEntity<Turma> criar(@Valid @RequestBody Turma turma, HttpServletResponse response) {
		Turma turmaSalva = turmaRepository.save(turma);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, turmaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(turmaSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_TURMA') and #oauth2.hasScope('read')")
	public ResponseEntity<Turma> buscaPeloCodigo(@PathVariable Long codigo) {
		Turma turma = turmaRepository.findOne(codigo);
		return turma != null ? ResponseEntity.ok(turma) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_TURMA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		turmaRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_TURMA') and #oauth2.hasScope('write')")
	public ResponseEntity<Turma> atualizar(@PathVariable Long codigo, @Valid @RequestBody Turma turma) {
		Turma turmaSalva = turmaService.atualizar(codigo, turma);
		return ResponseEntity.ok(turmaSalva);
	}

}
