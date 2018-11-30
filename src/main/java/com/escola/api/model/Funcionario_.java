package com.escola.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ {

	public static volatile SingularAttribute<Funcionario, Funcao> funcao;
	public static volatile SingularAttribute<Funcionario, Long> codigo;
	public static volatile SingularAttribute<Funcionario, String> telefone;
	public static volatile SingularAttribute<Funcionario, Endereco> endereco;
	public static volatile SingularAttribute<Funcionario, String> nome;
	public static volatile SingularAttribute<Funcionario, String> identidadeEmissor;
	public static volatile SingularAttribute<Funcionario, String> identidade;
	public static volatile SingularAttribute<Funcionario, LocalDate> dataDemissao;
	public static volatile SingularAttribute<Funcionario, String> senha;
	public static volatile SingularAttribute<Funcionario, LocalDate> identididadeEmissao;
	public static volatile SingularAttribute<Funcionario, LocalDate> dataContratacao;
	public static volatile SingularAttribute<Funcionario, String> identidadeEmissorEstado;
	public static volatile SingularAttribute<Funcionario, String> cpf;
	public static volatile SingularAttribute<Funcionario, String> celular;
	public static volatile SingularAttribute<Funcionario, Sexo> sexo;
	public static volatile SingularAttribute<Funcionario, LocalDate> dataNascimento;
	public static volatile SingularAttribute<Funcionario, String> email;
	public static volatile SingularAttribute<Funcionario, TipoSanguineo> sanguineo;

}

