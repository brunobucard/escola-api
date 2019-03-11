package com.escola.api.repository.periodoLetivo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.escola.api.model.PeriodoLetivo;
import com.escola.api.repository.filter.PeriodoLetivoFilter;

public interface PeriodoLetivoRepositoryQuery {
	
	public Page<PeriodoLetivo> filtrar (PeriodoLetivoFilter periodoLetivoFilter, Pageable pageable);

}
