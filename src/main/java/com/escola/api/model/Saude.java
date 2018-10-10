package com.escola.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Saude {
	
	private String medicao;
	
	@Column(name="doenca_congenita")
	private Boolean doencaCongenita;
	
	private Boolean hipertensao;
	
	private Boolean epilepsia;
	
	@Column(name="epilepsia_tratamento")
	private Boolean epilepsiaTratamento;
	
	private Boolean hemofilia;
	
	private Boolean diabetes;
	
	private Boolean diabetesInsulina;
	
	private Boolean asma;
	
	@Column(name="alergia_medicamento")
	private Boolean alergiaMedicamento;
	
	@Column(name="alergia_medicamento_descricao")
	private String alergiaMedicamentoDescricao;
	
	@Column(name="tratamento_medico")
	private Boolean tratamentoMedico;

	@Column(name="tratamento_medico_descricao")
	private String tratamentoMedicoDescricao;
	
	@Column(name="medicacao_especifica")
	private Boolean medicaoEspecifica;
	
	@Column(name="medicao_especifica_descricao")
	private String medicacaoEspecificaDescricao;
	
	@Column(name="nome_medico")
	private String nomeMedico;
	
	@Column(name="necessidade_especial")
	private Boolean necessidadeEspecial;
	
	
}
