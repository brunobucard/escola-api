package com.escola.api.model;

public enum TipoSanguineo {
	A_POSITIVO("A+"),
	A_NEGATIVO("A-"),
	B_POSITIVO("B+"),
	B_NEGATIVO("B-"),
	O_POSITIVO("O+"),
	O_NEGATIVO("O-"),
	AB_POSITIVO("AB+"),
	AB_NEGATIVO("AB-")
	
	;
	
	private final String descricao;
	
	TipoSanguineo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
