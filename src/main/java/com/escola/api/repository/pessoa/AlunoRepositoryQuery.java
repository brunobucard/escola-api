package com.escola.api.repository.pessoa;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.Aluno;
import com.escola.api.repository.filter.AlunoFilter;

public interface AlunoRepositoryQuery {
	
	public Page<Aluno> filtrar(AlunoFilter alunoFilter, Pageable pageable);

}
