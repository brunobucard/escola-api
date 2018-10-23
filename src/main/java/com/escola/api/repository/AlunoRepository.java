package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Aluno;
import com.escola.api.repository.aluno.AlunoRepositoryQuery;

public interface AlunoRepository  extends JpaRepository<Aluno, Long>, AlunoRepositoryQuery{

	public Page<Aluno> findByNomeContaining(String nome, Pageable pageable);
	
}
