package com.escola.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="periodo_letivo")
public class PeriodoLetivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	private String descricao;
	
	private Boolean ativo;
	
	@Column(name="data_inicio")
	private LocalDate dataInicio;
	
	@Column(name="data_termino")
	private LocalDate dataTermino;
	
	@Column(name="data_limite_matricula")
	private LocalDate dataLimiteMatricula;
	
	@Column(name="data_acesso_painel")
	private LocalDate dataAcessoPainel;
	
	@Column(name="bloquear_matricula")
	private Boolean bloquearMatricula;
	
	@Column(name="aluno_ativo_acesso")
	private Boolean alunoAtivoAcesso;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public LocalDate getDataLimiteMatricula() {
		return dataLimiteMatricula;
	}

	public void setDataLimiteMatricula(LocalDate dataLimiteMatricula) {
		this.dataLimiteMatricula = dataLimiteMatricula;
	}

	public LocalDate getDataAcessoPainel() {
		return dataAcessoPainel;
	}

	public void setDataAcessoPainel(LocalDate dataAcessoPainel) {
		this.dataAcessoPainel = dataAcessoPainel;
	}

	public Boolean getBloquearMatricula() {
		return bloquearMatricula;
	}

	public void setBloquearMatricula(Boolean bloquearMatricula) {
		this.bloquearMatricula = bloquearMatricula;
	}

	public Boolean getAlunoAtivoAcesso() {
		return alunoAtivoAcesso;
	}

	public void setAlunoAtivoAcesso(Boolean alunoAtivoAcesso) {
		this.alunoAtivoAcesso = alunoAtivoAcesso;
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
		PeriodoLetivo other = (PeriodoLetivo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
}


