package com.escola.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.escola.api.model.Responsavel;
import com.escola.api.repository.ResponsavelRepository;

@Service
public class ResponsavelService {

	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	public Responsavel atualizar(Long codigo, Responsavel responsavel) {
		Responsavel responsavelSalvo = buscarPeloCodigo(codigo);
		BeanUtils.copyProperties(responsavel, responsavelSalvo, "codigo");
		return responsavelRepository.save(responsavelSalvo);
	}
	
	private Responsavel buscarPeloCodigo(Long codigo) {
		Responsavel responsavelSalvo = responsavelRepository.findOne(codigo);
		if (responsavelSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return responsavelSalvo;
		
	}
}
