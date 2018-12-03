package com.escola.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Saude {
	
	private String medicacao;
	
	@Column(name="doenca_congenita")
	private Boolean doencaCongenita;
	
	private Boolean hipertensao;
	
	private Boolean epilepsia;
	
	@Column(name="epilepsia_tratamento")
	private Boolean epilepsiaTratamento;
	
	private Boolean hemofilia;
	
	private Boolean diabetes;
	
	@Column(name="diabetes_insulina")
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
	
	@Column(name="medicacao_especifica_descricao")
	private String medicacaoEspecificaDescricao;
	
	@Column(name="nome_medico")
	private String nomeMedico;
	
	@Column(name="necessidade_especial")
	@Enumerated(EnumType.STRING)
	private NecessidadeEspecial necessidadeEspecial;
	
	@Column(name="doenca_contagiosa")
	@Enumerated(EnumType.STRING)
	private DoencaContagiosa doencaContagiosa;
	
	@Column(name="doenca_contagiosa_outra")
	private String doencaContagiosaOutra;
	
	@Column(name="emergencia_nome")
	private String emergenciaNome;
	
	@Column(name="emergencia_parentesco")
	private String emergenciaParentesco;
	
	@Column(name="emergencia_telefone")
	private String emergenciaTelefone;
	
	@Column(name="emergencia_celular")
	private String emergenciaCelular;
	
	@Column(name="plano_saude")
	private Boolean planoSaude;
	
	@Column(name="plano_saude_descricao")
	private String planoSaudeDescricao;
	
	private String hospital;
	
	@Column(name="hospital_endereco")
	private String hospitalEndereco;
	
	@Column(name="hospital_telefone")
	private String hospitalTelefone;

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

	public Boolean getDoencaCongenita() {
		return doencaCongenita;
	}

	public void setDoencaCongenita(Boolean doencaCongenita) {
		this.doencaCongenita = doencaCongenita;
	}

	public Boolean getHipertensao() {
		return hipertensao;
	}

	public void setHipertensao(Boolean hipertensao) {
		this.hipertensao = hipertensao;
	}

	public Boolean getEpilepsia() {
		return epilepsia;
	}

	public void setEpilepsia(Boolean epilepsia) {
		this.epilepsia = epilepsia;
	}

	public Boolean getEpilepsiaTratamento() {
		return epilepsiaTratamento;
	}

	public void setEpilepsiaTratamento(Boolean epilepsiaTratamento) {
		this.epilepsiaTratamento = epilepsiaTratamento;
	}

	public Boolean getHemofilia() {
		return hemofilia;
	}

	public void setHemofilia(Boolean hemofilia) {
		this.hemofilia = hemofilia;
	}

	public Boolean getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(Boolean diabetes) {
		this.diabetes = diabetes;
	}

	public Boolean getDiabetesInsulina() {
		return diabetesInsulina;
	}

	public void setDiabetesInsulina(Boolean diabetesInsulina) {
		this.diabetesInsulina = diabetesInsulina;
	}

	public Boolean getAsma() {
		return asma;
	}

	public void setAsma(Boolean asma) {
		this.asma = asma;
	}

	public Boolean getAlergiaMedicamento() {
		return alergiaMedicamento;
	}

	public void setAlergiaMedicamento(Boolean alergiaMedicamento) {
		this.alergiaMedicamento = alergiaMedicamento;
	}

	public String getAlergiaMedicamentoDescricao() {
		return alergiaMedicamentoDescricao;
	}

	public void setAlergiaMedicamentoDescricao(String alergiaMedicamentoDescricao) {
		this.alergiaMedicamentoDescricao = alergiaMedicamentoDescricao;
	}

	public Boolean getTratamentoMedico() {
		return tratamentoMedico;
	}

	public void setTratamentoMedico(Boolean tratamentoMedico) {
		this.tratamentoMedico = tratamentoMedico;
	}

	public String getTratamentoMedicoDescricao() {
		return tratamentoMedicoDescricao;
	}

	public void setTratamentoMedicoDescricao(String tratamentoMedicoDescricao) {
		this.tratamentoMedicoDescricao = tratamentoMedicoDescricao;
	}

	public Boolean getMedicaoEspecifica() {
		return medicaoEspecifica;
	}

	public void setMedicaoEspecifica(Boolean medicaoEspecifica) {
		this.medicaoEspecifica = medicaoEspecifica;
	}

	public String getMedicacaoEspecificaDescricao() {
		return medicacaoEspecificaDescricao;
	}

	public void setMedicacaoEspecificaDescricao(String medicacaoEspecificaDescricao) {
		this.medicacaoEspecificaDescricao = medicacaoEspecificaDescricao;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public NecessidadeEspecial getNecessidadeEspecial() {
		return necessidadeEspecial;
	}

	public void setNecessidadeEspecial(NecessidadeEspecial necessidadeEspecial) {
		this.necessidadeEspecial = necessidadeEspecial;
	}

	public DoencaContagiosa getDoencaContagiosa() {
		return doencaContagiosa;
	}

	public void setDoencaContagiosa(DoencaContagiosa doencaContagiosa) {
		this.doencaContagiosa = doencaContagiosa;
	}

	public String getDoencaContagiosaOutra() {
		return doencaContagiosaOutra;
	}

	public void setDoencaContagiosaOutra(String doencaContagiosaOutra) {
		this.doencaContagiosaOutra = doencaContagiosaOutra;
	}

	public String getEmergenciaNome() {
		return emergenciaNome;
	}

	public void setEmergenciaNome(String emergenciaNome) {
		this.emergenciaNome = emergenciaNome;
	}

	public String getEmergenciaParentesco() {
		return emergenciaParentesco;
	}

	public void setEmergenciaParentesco(String emergenciaParentesco) {
		this.emergenciaParentesco = emergenciaParentesco;
	}

	public String getEmergenciaTelefone() {
		return emergenciaTelefone;
	}

	public void setEmergenciaTelefone(String emergenciaTelefone) {
		this.emergenciaTelefone = emergenciaTelefone;
	}

	public String getEmergenciaCelular() {
		return emergenciaCelular;
	}

	public void setEmergenciaCelular(String emergenciaCelular) {
		this.emergenciaCelular = emergenciaCelular;
	}

	public Boolean getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(Boolean planoSaude) {
		this.planoSaude = planoSaude;
	}

	public String getPlanoSaudeDescricao() {
		return planoSaudeDescricao;
	}

	public void setPlanoSaudeDescricao(String planoSaudeDescricao) {
		this.planoSaudeDescricao = planoSaudeDescricao;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getHospitalEndereco() {
		return hospitalEndereco;
	}

	public void setHospitalEndereco(String hospitalEndereco) {
		this.hospitalEndereco = hospitalEndereco;
	}

	public String getHospitalTelefone() {
		return hospitalTelefone;
	}

	public void setHospitalTelefone(String hospitalTelefone) {
		this.hospitalTelefone = hospitalTelefone;
	}
	
	
	
	
}
