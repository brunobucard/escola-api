package com.escola.api.model;

public enum NecessidadeEspecial {
	
	MOTORA("Motora"),
	VISUAL("Visual"),
	AUDITIVA("Auditiva"),
	AUTISMO("Autismo"),
	OUTRO("Outro")
	
	;
	
	private final String descricao;
	
	NecessidadeEspecial(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
