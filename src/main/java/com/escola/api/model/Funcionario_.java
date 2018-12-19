package com.escola.api.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ {

	public static volatile SingularAttribute<Funcionario, Funcao> funcao;
	public static volatile SingularAttribute<Funcionario, String> telefone;
	public static volatile SingularAttribute<Funcionario, String> observacao;
	public static volatile SingularAttribute<Funcionario, Boolean> ativo;
	public static volatile SingularAttribute<Funcionario, LocalDate> carteiraTrabalhoEmissao;
	public static volatile SingularAttribute<Funcionario, Cor> cor;
	public static volatile SingularAttribute<Funcionario, String> identidadeEmissor;
	public static volatile SingularAttribute<Funcionario, String> mae;
	public static volatile SingularAttribute<Funcionario, String> naturalidade;
	public static volatile SingularAttribute<Funcionario, String> carteiraTrabalho;
	public static volatile SingularAttribute<Funcionario, String> cpf;
	public static volatile SingularAttribute<Funcionario, String> celular;
	public static volatile SingularAttribute<Funcionario, String> conjuge;
	public static volatile SingularAttribute<Funcionario, String> pai;
	public static volatile SingularAttribute<Funcionario, String> pis;
	public static volatile SingularAttribute<Funcionario, String> escolaridade;
	public static volatile SingularAttribute<Funcionario, LocalDate> dataNascimento;
	public static volatile SingularAttribute<Funcionario, String> email;
	public static volatile SingularAttribute<Funcionario, String> religiao;
	public static volatile SingularAttribute<Funcionario, Long> codigo;
	public static volatile SingularAttribute<Funcionario, String> carteiraTrabalhoEstado;
	public static volatile SingularAttribute<Funcionario, LocalDate> demissao;
	public static volatile SingularAttribute<Funcionario, String> naturalidadeEstado;
	public static volatile SingularAttribute<Funcionario, Endereco> endereco;
	public static volatile SingularAttribute<Funcionario, BigDecimal> salario;
	public static volatile SingularAttribute<Funcionario, String> identidadeEstado;
	public static volatile SingularAttribute<Funcionario, String> profissao;
	public static volatile SingularAttribute<Funcionario, String> nome;
	public static volatile SingularAttribute<Funcionario, EstadoCivil> estadoCivil;
	public static volatile SingularAttribute<Funcionario, String> identidade;
	public static volatile SingularAttribute<Funcionario, String> carteiraTrabalhoSerie;
	public static volatile SingularAttribute<Funcionario, LocalDate> admissao;
	public static volatile SingularAttribute<Funcionario, Boolean> professor;
	public static volatile SingularAttribute<Funcionario, LocalDate> identididadeEmissao;
	public static volatile SingularAttribute<Funcionario, Sexo> sexo;
	public static volatile SingularAttribute<Funcionario, String> nacionalidade;
	public static volatile SingularAttribute<Funcionario, TipoSanguineo> sanguineo;

}

