package com.escola.api.model;

public enum Periodo {

	MANHA("Manhã"),
	TARDE("Tarde"),
	NOITE("Noite"),
	INTEGRAL("Integral")
	
	;
	
	private final String descricao;
	
	Periodo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
