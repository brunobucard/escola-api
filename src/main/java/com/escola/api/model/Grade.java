package com.escola.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="grade")
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String descricao;
	
	@Column(name="carga_horaria_total")
	private Double cargaHorariaTotal;
	
	@Column(name="conteudo_programatico")
	private String conteudoProgramatico;

	
}
