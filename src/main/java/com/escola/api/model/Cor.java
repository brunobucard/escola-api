package com.escola.api.model;

public enum Cor {
	
	BRANCO("Branco"),
	PRETO("Preto"),
	PARDO("Pardo"),
	AMARELO("Amarelo"),
	INDIGENA("Indigena")
	
	;
	
	private final String descricao;
	
	Cor(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
