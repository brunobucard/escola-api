package com.escola.api.model;

public enum EstadoCivil {
	SOLTEIRO("Solteiro"),
	CASADO("Casado"),
	UNIAO_ESTAVEL("União estável"),
	DIVORCIADO("Divorciado"),
	SEPARADO("Separado"),
	VIUVO("Viúvo")
	
	;
	
	private final String descricao;
	
	EstadoCivil(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
