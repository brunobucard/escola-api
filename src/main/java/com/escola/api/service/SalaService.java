package com.escola.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.escola.api.model.Sala;
import com.escola.api.model.Turma;
import com.escola.api.repository.SalaRepository;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepository salaRepository;
	
	public Sala atualizar(Long codigo, Sala sala) {
		Sala salaSalva = buscarPeloCodigo(codigo);
		BeanUtils.copyProperties(sala, salaSalva, "codigo");
		return salaRepository.save(salaSalva);
	}
	
	
	private Sala buscarPeloCodigo(Long codigo) {
		Sala salaSalva = salaRepository.findOne(codigo);
		if (salaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salaSalva;
		
	}

}
