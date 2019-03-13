package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.PeriodoLetivo;
import com.escola.api.repository.periodoLetivo.PeriodoLetivoRepositoryQuery;


public interface PeriodoLetivoRepository extends JpaRepository<PeriodoLetivo, Long>, PeriodoLetivoRepositoryQuery {

	//public Page<PeriodoLetivo> findByPeriodoLetivoContaining(String periodoLetivo, Pageable pageable);
}
