package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Responsavel;
import com.escola.api.repository.responsavel.ResponsavelRepositoryQuery;

public interface ResponsavelRepository extends JpaRepository<Responsavel, Long>, ResponsavelRepositoryQuery{
	public Page<Responsavel>findByNomeContaining(String nome, Pageable pageable);

}
