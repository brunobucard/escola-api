package com.escola.api.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sala.class)
public abstract class Sala_ {

	public static volatile SingularAttribute<Sala, Long> codigo;
	public static volatile SingularAttribute<Sala, BigDecimal> tamanho;
	public static volatile SingularAttribute<Sala, String> observacao;
	public static volatile SingularAttribute<Sala, String> sala;
	public static volatile SingularAttribute<Sala, Integer> limitePessoa;

}

