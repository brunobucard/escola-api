package com.escola.api.model;

public enum DoencaContagiosa {

	CAXUMBA("Caxumba"),
	SARAMPO("Sarampo"),
	RUBEOLA("Rubeola"),
	CATAPORA("Catapora"),
	ESCARLATINA("Escarlatina"),
	COQUELUCHE("Coqueluche"),
	OUTRAS("Outras")
	;
	
	private final String descricao;
	
	DoencaContagiosa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
