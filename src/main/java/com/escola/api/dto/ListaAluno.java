package com.escola.api.dto;

import com.escola.api.model.Aluno;

public class ListaAluno {
	
	private Aluno aluno;

	public ListaAluno(Aluno aluno) {
		super();
		this.aluno = aluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
