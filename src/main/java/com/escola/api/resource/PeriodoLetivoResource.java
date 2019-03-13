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
import com.escola.api.model.PeriodoLetivo;
import com.escola.api.model.Sala;
import com.escola.api.repository.PeriodoLetivoRepository;
import com.escola.api.repository.filter.PeriodoLetivoFilter;
import com.escola.api.repository.filter.SalaFilter;
import com.escola.api.service.PeriodoLetivoService;

@RestController
@RequestMapping("/periodosLetivos")
public class PeriodoLetivoResource {

	@Autowired
	private PeriodoLetivoRepository periodoLetivoRepository;
	
	@Autowired
	private PeriodoLetivoService periodoLetivoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public Page<PeriodoLetivo> pesquisar(PeriodoLetivoFilter periodoLetivoFilter, Pageable pageable) {
		return periodoLetivoRepository.filtrar(periodoLetivoFilter, pageable);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_PERIODO_LETIVO') and #oauth2.hasScope('read')")
	public ResponseEntity<PeriodoLetivo> buscaPeloCodigo(@PathVariable Long codigo) {
		PeriodoLetivo periodoLetivo = periodoLetivoRepository.findOne(codigo);
		return periodoLetivo != null ? ResponseEntity.ok(periodoLetivo) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PERIODO_LETIVO') and #oauth2.hasScope('write')")
	public ResponseEntity<PeriodoLetivo> criar(@Valid @RequestBody PeriodoLetivo periodoLetivo, HttpServletResponse response) {
		PeriodoLetivo periodoLetivoSalvo = periodoLetivoRepository.save(periodoLetivo);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, periodoLetivoSalvo.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(periodoLetivoSalvo);
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_PERIODO_LETIVO') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		periodoLetivoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PERIODO_LETIVO') and #oauth2.hasScope('write')")
	public ResponseEntity<PeriodoLetivo> atualizar(@PathVariable Long codigo, @Valid @RequestBody PeriodoLetivo periodoLetivo) {
		PeriodoLetivo periodoLetivoSalvo = periodoLetivoService.atualizar(codigo, periodoLetivo);
		return ResponseEntity.ok(periodoLetivoSalvo);
	}
}
