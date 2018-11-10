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
import com.escola.api.repository.ResponsavelRepository;
import com.escola.api.repository.filter.ResponsavelFilter;
import com.escola.api.service.ResponsavelService;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelResource {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	@Autowired
	private ResponsavelService responsavelService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_RESPONSAVEL')")
	public Page<Responsavel> pesquisar(ResponsavelFilter responsavelFilter, Pageable pageable) {
		return responsavelRepository.filtrar(responsavelFilter, pageable);
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_RESPONSAVEL') and #oauth2.hasScope('write')")
	public ResponseEntity<Responsavel> criar(@Valid @RequestBody Responsavel responsavel, HttpServletResponse response) {
		Responsavel responsavelSalvo = responsavelRepository.save(responsavel);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, responsavelSalvo.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(responsavelSalvo);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_RESPONSAVEL') and #oauth2.hasScope('read')")
	public ResponseEntity<Responsavel> buscaPeloCodigo(@PathVariable Long codigo) {
		Responsavel responsavel = responsavelRepository.findOne(codigo);
		return responsavel != null ? ResponseEntity.ok(responsavel) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_RESPONSAVEL') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		responsavelRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_RESPONSAVEL') and #oauth2.hasScope('write')")
	public ResponseEntity<Responsavel> atualizar(@PathVariable Long codigo, @Valid @RequestBody Responsavel responsavel) {
		Responsavel responsavelSalvo = responsavelService.atualizar(codigo, responsavel);
		return ResponseEntity.ok(responsavelSalvo);
	}

}
