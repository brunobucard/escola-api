package com.escola.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Responsavel;
import com.escola.api.repository.ResponsavelRepository;
import com.escola.api.repository.filter.ResponsavelFilter;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelResource {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	
	@GetMapping
	public Page<Responsavel> pesquisar(ResponsavelFilter responsavelFilter, Pageable pageable) {
		return responsavelRepository.filtrar(responsavelFilter, pageable);
	}

}
