package com.escola.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.escola.api.model.PeriodoLetivo;
import com.escola.api.repository.PeriodoLetivoRepository;

@Service
public class PeriodoLetivoService {
	
	@Autowired
	private PeriodoLetivoRepository periodoLetivoRepository;
	
	public PeriodoLetivo atualizar(Long codigo, PeriodoLetivo periodoLetivo) {
		PeriodoLetivo periodoLetivoSalvo = buscarPeloCodigo(codigo);
		BeanUtils.copyProperties(periodoLetivo, periodoLetivoSalvo, "codigo");
		return periodoLetivoRepository.save(periodoLetivoSalvo);
	}
	
	private PeriodoLetivo buscarPeloCodigo(Long codigo) {
		PeriodoLetivo periodoLetivoSalvo = periodoLetivoRepository.findOne(codigo);
		if (periodoLetivoSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return periodoLetivoSalvo;
	}

}
