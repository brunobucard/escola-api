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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Boolean ativo;
	
	@NotNull
	@Column(name="data_nascimento")
	private LocalDate dataNascimento;
	
	private String naturalidade;
	
	@Column(name="naturalidade_estado")
	private String naturalidadeEstado;
	
	private String nacionalidade;
	
	private String cpf;
	
	private String identidade;
	
	@Column(name="identidade_emissao")
	private LocalDate identidadeEmissao;
	
	@Column(name="identidade_emissor")
	private String identidadeEmissor;
	
	@Column(name="identidade_emissor_estado")
	private String identidadeEmissorEstado;
	
	@Column(name="certidao_nascimento")
	private String certidaoNascimento;
	
	@Column(name="certidao_data")
	private LocalDate certidaoData;
	
	@Column(name="certidao_livro")
	private String certidaoLivro;
	
	@Column(name="certidao_folhas")
	private String certidaoFolhas;
	
	@Column(name="certidao_cartorio")
	private String certidaoCartorio;
	
	@Column(name="certidao_estado")
	private String certidaoEstado;
	
	@Embedded	
	private Endereco endereco;
	
	@Embedded
	private Saude saude;
	
	private String telefone;
	
	private String celular;
	
	@Column(name="pais_separados")
	private Boolean paisSeparados;
	
	@Column(name="reside_com")
	private String resideCom;
	
	@Column(name="escola_origem")
	private String escolaOrigem;
	
	@Column(name="escola_origem_cidade")
	private String escolaOrigemCidade;
	
	@Column(name="escola_origem_estado")
	private String escolaOrigemEstado;
	
	private String religiao;
	
	private String email;
	
	private String senha;
	
	
	
	@Column(name="nome_mae")
	private String nomeMae;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;
	
	@ManyToOne
	@JoinColumn(name="codigo_responsavel")
	private Responsavel responsavel;
	
	@Enumerated
	private Cor cor;
	
	@Enumerated
	@Column(name="estado_civil")
	private EstadoCivil estadoCivil;
	
	@Column(name="data_ingresso")
	private LocalDate dataIngresso;
	
	private String observacao;
	
	
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}



	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getReligiao() {
		return religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
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

	
	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
	

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
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

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
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

	public String getCertidaoNascimento() {
		return certidaoNascimento;
	}

	public void setCertidaoNascimento(String certidaoNascimento) {
		this.certidaoNascimento = certidaoNascimento;
	}

	

	public LocalDate getIdentidadeEmissao() {
		return identidadeEmissao;
	}

	public void setIdentidadeEmissao(LocalDate identidadeEmissao) {
		this.identidadeEmissao = identidadeEmissao;
	}

	public LocalDate getCertidaoData() {
		return certidaoData;
	}

	public void setCertidaoData(LocalDate certidaoData) {
		this.certidaoData = certidaoData;
	}

	public String getCertidaoLivro() {
		return certidaoLivro;
	}

	public void setCertidaoLivro(String certidaoLivro) {
		this.certidaoLivro = certidaoLivro;
	}

	public String getCertidaoFolhas() {
		return certidaoFolhas;
	}

	public void setCertidaoFolhas(String certidaoFolhas) {
		this.certidaoFolhas = certidaoFolhas;
	}

	public String getCertidaoCartorio() {
		return certidaoCartorio;
	}

	public void setCertidaoCartorio(String certidaoCartorio) {
		this.certidaoCartorio = certidaoCartorio;
	}

	public String getCertidaoEstado() {
		return certidaoEstado;
	}

	public void setCertidaoEstado(String certidaoEstado) {
		this.certidaoEstado = certidaoEstado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public Boolean getPaisSeparados() {
		return paisSeparados;
	}

	public void setPaisSeparados(Boolean paisSeparados) {
		this.paisSeparados = paisSeparados;
	}

	public String getResideCom() {
		return resideCom;
	}

	public void setResideCom(String resideCom) {
		this.resideCom = resideCom;
	}

	public String getEscolaOrigem() {
		return escolaOrigem;
	}

	public void setEscolaOrigem(String escolaOrigem) {
		this.escolaOrigem = escolaOrigem;
	}

	public String getEscolaOrigemCidade() {
		return escolaOrigemCidade;
	}

	public void setEscolaOrigemCidade(String escolaOrigemCidade) {
		this.escolaOrigemCidade = escolaOrigemCidade;
	}

	public String getEscolaOrigemEstado() {
		return escolaOrigemEstado;
	}

	public void setEscolaOrigemEstado(String escolaOrigemEstado) {
		this.escolaOrigemEstado = escolaOrigemEstado;
	}
	
	

	public Saude getSaude() {
		return saude;
	}

	public void setSaude(Saude saude) {
		this.saude = saude;
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
	
	

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@JsonIgnore
	@Transient
	public boolean isInativo() {
		return !this.ativo;
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
		Aluno other = (Aluno) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
