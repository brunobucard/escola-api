package com.escola.api.repository.turma;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.Turma;
import com.escola.api.repository.filter.TurmaFilter;

public interface TurmaRepositoryQuery {
	
	public Page<Turma> filtrar (TurmaFilter turmaFilter, Pageable pageable);

	

}
