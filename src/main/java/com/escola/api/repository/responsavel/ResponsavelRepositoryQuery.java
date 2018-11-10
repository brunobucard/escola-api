package com.escola.api.repository.responsavel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.Responsavel;
import com.escola.api.repository.filter.ResponsavelFilter;

public interface ResponsavelRepositoryQuery {
	
	public Page<Responsavel> filtrar(ResponsavelFilter responsavelFilter, Pageable pageable);

}
