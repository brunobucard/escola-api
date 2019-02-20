package com.escola.api.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PeriodoLetivo.class)
public abstract class PeriodoLetivo_ {

	public static volatile SingularAttribute<PeriodoLetivo, Long> codigo;
	public static volatile SingularAttribute<PeriodoLetivo, Boolean> ativo;
	public static volatile SingularAttribute<PeriodoLetivo, LocalDate> dataLimiteMatricula;
	public static volatile SingularAttribute<PeriodoLetivo, Boolean> bloquearMatricula;
	public static volatile SingularAttribute<PeriodoLetivo, LocalDate> dataTermino;
	public static volatile SingularAttribute<PeriodoLetivo, LocalDate> dataInicio;
	public static volatile SingularAttribute<PeriodoLetivo, Boolean> alunoAtivoAcesso;
	public static volatile SingularAttribute<PeriodoLetivo, LocalDate> dataAcessoPainel;
	public static volatile SingularAttribute<PeriodoLetivo, String> descricao;

}

