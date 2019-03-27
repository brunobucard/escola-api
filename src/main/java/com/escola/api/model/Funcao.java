package com.escola.api.model;

public enum Funcao {

	PROFESSOR("Professor"),
	SECRETARIO("Secretário"),
	ORIENTADOR("Orientador"),
	DIRETOR("Diretor"),
	COZINHEIRO("Cozinheiro"),
	AUXILIAR_DE_SERVICOS_GERAIS("Auxiliar de serviços gerais")
	
	;
	
	private final String descricao;
	
	Funcao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
