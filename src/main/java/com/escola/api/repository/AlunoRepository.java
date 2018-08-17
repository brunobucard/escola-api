package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Aluno;

public interface AlunoRepository  extends JpaRepository<Aluno, Long>{

	public Page<Aluno> findByNomeContaining(String nome, Pageable pageable);
	
}
