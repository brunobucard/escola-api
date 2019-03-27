package com.escola.api.model;

public enum Sexo {

	MASCULINO("Masculino"),
	FEMININO("Feminino")
	
	;
	
	private final String descricao;
	
	Sexo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
