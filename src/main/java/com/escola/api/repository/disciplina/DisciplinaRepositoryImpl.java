package com.escola.api.repository.disciplina;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import com.escola.api.model.Disciplina;
import com.escola.api.model.Disciplina_;
import com.escola.api.repository.filter.DisciplinaFilter;


public class DisciplinaRepositoryImpl implements DisciplinaRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<Disciplina> filtrar(DisciplinaFilter disciplinaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Disciplina> criteria = builder.createQuery(Disciplina.class);
		Root<Disciplina> root = criteria.from(Disciplina.class);
		
		Predicate[] predicates = criarRestricoes(disciplinaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Disciplina> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(disciplinaFilter));
	}
	
	private Long total(DisciplinaFilter disciplinaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Disciplina> root = criteria.from(Disciplina.class);
		
		Predicate[] predicates = criarRestricoes(disciplinaFilter, builder, root);
		criteria.where(predicates);
		
		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}
	
	private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistroPorPagina = pageable.getPageSize();
		int primeiroResgistroDaPagina = paginaAtual * totalRegistroPorPagina;
		
		query.setFirstResult(primeiroResgistroDaPagina);
		query.setMaxResults(totalRegistroPorPagina);
	}
	
	private Predicate[] criarRestricoes(DisciplinaFilter disciplinaFilter, CriteriaBuilder builder, Root<Disciplina> root) {
		List<Predicate> predicates = new ArrayList<>();
		
		if(!StringUtils.isEmpty(disciplinaFilter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Disciplina_.descricao)), "%" + disciplinaFilter.getDescricao().toLowerCase() + "%"));
			
		}
		
		if(!StringUtils.isEmpty(disciplinaFilter.getAbreviacao())) {
			predicates.add(builder.like(builder.lower(root.get(Disciplina_.abreviacao)), "%" + disciplinaFilter.getAbreviacao().toLowerCase() + "%"));
			
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	

	
	
	

}
