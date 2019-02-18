package com.escola.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.escola.api.model.Disciplina;
import com.escola.api.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	public Disciplina atualizar(Long codigo, Disciplina disciplina) {
		Disciplina disciplinaSalva = buscarPeloCodigo(codigo);
		BeanUtils.copyProperties(disciplina, disciplinaSalva, "codigo");
		return disciplinaRepository.save(disciplinaSalva);
	}
	
	private Disciplina buscarPeloCodigo(Long codigo) {
		Disciplina disciplinaSalva = disciplinaRepository.findOne(codigo);
		if (disciplinaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return disciplinaSalva;
		
	}

}
