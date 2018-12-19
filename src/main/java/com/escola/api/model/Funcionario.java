package com.escola.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	private String nome;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
    private String cpf;
	
	private String identidade;
	
	@Column(name="data_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name="identidade_emissao")
	private LocalDate identididadeEmissao;
	
	@Column(name="identidade_emissor")
	private String identidadeEmissor;
	
	@Column(name="identidade_estado")
	private String identidadeEstado;
	
	
	
	@Embedded
	private Endereco endereco;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_sanguineo")
	private TipoSanguineo sanguineo;
	
	@Enumerated(EnumType.STRING)
	private Funcao funcao;
	
	private String telefone;
	
	private String celular;
	
	private String email;
	
	
	private String nacionalidade;
	
	private String pis;
	
	@Column(name="carteira_trabalho")
	private String carteiraTrabalho;
	
	@Column(name="carteira_trabalho_serie")
	private String carteiraTrabalhoSerie;
	
	@Column(name="carteira_trabalho_emissao")
	private LocalDate carteiraTrabalhoEmissao;
	
	@Column(name="carteira_trabalho_estado")
	private String carteiraTrabalhoEstado;
	
	private LocalDate admissao;
	
	private LocalDate demissao;
	
	private BigDecimal salario;
	
	private String observacao;
	
	private String conjuge;
	
	private String naturalidade;
	
	@Column(name="naturalidade_estado")
	private String naturalidadeEstado;
	
	private String mae;
	
	private String pai;
	
	private Boolean ativo;
	
	private Boolean professor;
	
	private String religiao;
	
	private String escolaridade;
	
	private String profissao;
	
	@Enumerated(EnumType.STRING)
	private Cor cor;
	
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;
	

	
	
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getIdentididadeEmissao() {
		return identididadeEmissao;
	}

	public void setIdentididadeEmissao(LocalDate identididadeEmissao) {
		this.identididadeEmissao = identididadeEmissao;
	}

	public String getIdentidadeEmissor() {
		return identidadeEmissor;
	}

	public void setIdentidadeEmissor(String identidadeEmissor) {
		this.identidadeEmissor = identidadeEmissor;
	}

	

	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoSanguineo getSanguineo() {
		return sanguineo;
	}

	public void setSanguineo(TipoSanguineo sanguineo) {
		this.sanguineo = sanguineo;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	

	public String getIdentidadeEstado() {
		return identidadeEstado;
	}

	public void setIdentidadeEstado(String identidadeEstado) {
		this.identidadeEstado = identidadeEstado;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	

	public String getCarteiraTrabalhoSerie() {
		return carteiraTrabalhoSerie;
	}

	public void setCarteiraTrabalhoSerie(String carteiraTrabalhoSerie) {
		this.carteiraTrabalhoSerie = carteiraTrabalhoSerie;
	}

	public LocalDate getCarteiraTrabalhoEmissao() {
		return carteiraTrabalhoEmissao;
	}

	public void setCarteiraTrabalhoEmissao(LocalDate carteiraTrabalhoEmissao) {
		this.carteiraTrabalhoEmissao = carteiraTrabalhoEmissao;
	}

	public String getCarteiraTrabalhoEstado() {
		return carteiraTrabalhoEstado;
	}

	public void setCarteiraTrabalhoEstado(String carteiraTrabalhoEstado) {
		this.carteiraTrabalhoEstado = carteiraTrabalhoEstado;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

	public LocalDate getDemissao() {
		return demissao;
	}

	public void setDemissao(LocalDate demissao) {
		this.demissao = demissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNaturalidadeEstado() {
		return naturalidadeEstado;
	}

	public void setNaturalidadeEstado(String naturalidadeEstado) {
		this.naturalidadeEstado = naturalidadeEstado;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getProfessor() {
		return professor;
	}

	public void setProfessor(Boolean professor) {
		this.professor = professor;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
