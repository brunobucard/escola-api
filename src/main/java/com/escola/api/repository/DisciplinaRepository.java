package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Disciplina;
import com.escola.api.repository.disciplina.DisciplinaRepositoryQuery;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>, DisciplinaRepositoryQuery {
	
	public Page<Disciplina> findBy(String descricao, Pageable pageable);


}
