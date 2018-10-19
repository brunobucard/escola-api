package com.escola.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.escola.api.model.Aluno;
import com.escola.api.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno atualizar(Long codigo, Aluno aluno) {
		Aluno alunoSalvo = buscarAlunoPeloCodigo(codigo);
		BeanUtils.copyProperties(aluno, alunoSalvo, "codigo");
		return alunoRepository.save(alunoSalvo);
	}
	
	
	
	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Aluno alunoSalvo = buscarAlunoPeloCodigo(codigo);
		alunoSalvo.setAtivo(ativo);
		alunoRepository.save(alunoSalvo);
	}
	
	private Aluno buscarAlunoPeloCodigo(Long codigo) {
		Aluno alunoSalvo = alunoRepository.findOne(codigo);
		if (alunoSalvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return alunoSalvo;
	}

}
