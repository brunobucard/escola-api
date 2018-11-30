package com.escola.api.model;

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
	
	@Column(name="identidade_emissor_estado")
	private String identidadeEmissorEstado;
	
	@Column(name="data_contratacao")
	private LocalDate dataContratacao;
	
	@Column(name="data_demissao")
	private LocalDate dataDemissao;
	
	@Embedded
	private Endereco endereco;
	
	@Enumerated(EnumType.STRING)
	private TipoSanguineo sanguineo;
	
	@Enumerated(EnumType.STRING)
	private Funcao funcao;
	
	private String telefone;
	
	private String celular;
	
	private String email;
	
	private String senha;

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

	public String getIdentidadeEmissorEstado() {
		return identidadeEmissorEstado;
	}

	public void setIdentidadeEmissorEstado(String identidadeEmissorEstado) {
		this.identidadeEmissorEstado = identidadeEmissorEstado;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
