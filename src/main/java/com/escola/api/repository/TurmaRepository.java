package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Turma;
import com.escola.api.repository.turma.TurmaRepositoryQuery;

public interface TurmaRepository extends JpaRepository<Turma, Long>, TurmaRepositoryQuery {

	public Page<Turma> findByTurmaContaining(String turma, Pageable pageable);
}
