package com.escola.api.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Saude.class)
public abstract class Saude_ {

	public static volatile SingularAttribute<Saude, String> medicacao;
	public static volatile SingularAttribute<Saude, Boolean> hemofilia;
	public static volatile SingularAttribute<Saude, Boolean> diabetesInsulina;
	public static volatile SingularAttribute<Saude, String> doencaContagiosaOutra;
	public static volatile SingularAttribute<Saude, String> hospitalTelefone;
	public static volatile SingularAttribute<Saude, NecessidadeEspecial> necessidadeEspecial;
	public static volatile SingularAttribute<Saude, Boolean> planoSaude;
	public static volatile SingularAttribute<Saude, String> emergenciaNome;
	public static volatile SingularAttribute<Saude, String> nomeMedico;
	public static volatile SingularAttribute<Saude, Boolean> alergiaMedicamento;
	public static volatile SingularAttribute<Saude, String> hospital;
	public static volatile SingularAttribute<Saude, String> tratamentoMedicoDescricao;
	public static volatile SingularAttribute<Saude, DoencaContagiosa> doencaContagiosa;
	public static volatile SingularAttribute<Saude, Boolean> medicaoEspecifica;
	public static volatile SingularAttribute<Saude, String> emergenciaCelular;
	public static volatile SingularAttribute<Saude, String> medicacaoEspecificaDescricao;
	public static volatile SingularAttribute<Saude, Boolean> hipertensao;
	public static volatile SingularAttribute<Saude, Boolean> asma;
	public static volatile SingularAttribute<Saude, Boolean> tratamentoMedico;
	public static volatile SingularAttribute<Saude, String> emergenciaTelefone;
	public static volatile SingularAttribute<Saude, String> planoSaudeDescricao;
	public static volatile SingularAttribute<Saude, String> alergiaMedicamentoDescricao;
	public static volatile SingularAttribute<Saude, String> hospitalEndereco;
	public static volatile SingularAttribute<Saude, Boolean> epilepsia;
	public static volatile SingularAttribute<Saude, Boolean> epilepsiaTratamento;
	public static volatile SingularAttribute<Saude, Boolean> doencaCongenita;
	public static volatile SingularAttribute<Saude, Boolean> diabetes;
	public static volatile SingularAttribute<Saude, String> emergenciaParentesco;

}

