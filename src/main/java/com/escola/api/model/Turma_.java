package com.escola.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Turma.class)
public abstract class Turma_ {

	public static volatile SingularAttribute<Turma, Long> codigo;
	public static volatile SingularAttribute<Turma, Integer> vaga;
	public static volatile SingularAttribute<Turma, Periodo> periodo;
	public static volatile SingularAttribute<Turma, Sala> sala;
	public static volatile SingularAttribute<Turma, Serie> serie;
	public static volatile ListAttribute<Turma, Funcionario> funcionarios;
	public static volatile SingularAttribute<Turma, String> turma;

}

