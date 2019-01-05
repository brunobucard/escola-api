package com.escola.api.repository.sala;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.Sala;
import com.escola.api.repository.filter.SalaFilter;

public interface SalaRepositoryQuery {
	
	public Page<Sala> filtrar (SalaFilter salaFilter, Pageable pageable);

}
