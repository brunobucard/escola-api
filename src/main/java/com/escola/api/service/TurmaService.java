package com.escola.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;


import com.escola.api.model.Turma;
import com.escola.api.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	public Turma atualizar(Long codigo, Turma turma) {
		Turma turmaSalva = buscarPeloCodigo(codigo);
		BeanUtils.copyProperties(turma, turmaSalva, "codigo");
		return turmaRepository.save(turmaSalva);
	}
	
	private Turma buscarPeloCodigo(Long codigo) {
		Turma turmaSalva = turmaRepository.findOne(codigo);
		if (turmaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return turmaSalva;
		
	}

}
