package com.escola.api.repository.disciplina;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.Disciplina;
import com.escola.api.repository.filter.DisciplinaFilter;

public interface DisciplinaRepositoryQuery {
	
	public Page<Disciplina> filtrar (DisciplinaFilter disciplinaFilter, Pageable pageable);
	

}
