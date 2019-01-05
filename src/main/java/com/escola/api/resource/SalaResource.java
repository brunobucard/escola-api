package com.escola.api.resource;

import java.util.List;

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
import com.escola.api.model.Sala;
import com.escola.api.model.Turma;
import com.escola.api.repository.SalaRepository;
import com.escola.api.repository.filter.SalaFilter;
import com.escola.api.repository.filter.TurmaFilter;
import com.escola.api.service.SalaService;

@RestController
@RequestMapping("/salas")
public class SalaResource {
	
	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private SalaService salaService; 
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public Page<Sala> pesquisar(SalaFilter salaFilter, Pageable pageable) {
		return salaRepository.filtrar(salaFilter, pageable);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_SALA') and #oauth2.hasScope('read')")
	public ResponseEntity<Sala> buscaPeloCodigo(@PathVariable Long codigo) {
		Sala sala = salaRepository.findOne(codigo);
		return sala != null ? ResponseEntity.ok(sala) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_SALA') and #oauth2.hasScope('write')")
	public ResponseEntity<Sala> criar(@Valid @RequestBody Sala sala, HttpServletResponse response) {
		Sala salaSalva = salaRepository.save(sala);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, salaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(salaSalva);
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_SALA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		salaRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_SALA') and #oauth2.hasScope('write')")
	public ResponseEntity<Sala> atualizar(@PathVariable Long codigo, @Valid @RequestBody Sala sala) {
		Sala salaSalva = salaService.atualizar(codigo, sala);
		return ResponseEntity.ok(salaSalva);
	}
	
	
}
