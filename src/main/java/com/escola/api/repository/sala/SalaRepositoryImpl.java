package com.escola.api.repository.sala;

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

import com.escola.api.model.Sala;
import com.escola.api.model.Sala_;
import com.escola.api.model.Turma;
import com.escola.api.model.Turma_;
import com.escola.api.repository.filter.SalaFilter;
import com.escola.api.repository.filter.TurmaFilter;

public class SalaRepositoryImpl implements SalaRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<Sala> filtrar(SalaFilter salaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Sala> criteria = builder.createQuery(Sala.class);
		Root<Sala> root = criteria.from(Sala.class);
		
		Predicate[] predicates = criarRestricoes(salaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Sala> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(salaFilter));
	}
	
	private Long total(SalaFilter salaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Sala> root = criteria.from(Sala.class);
		
		Predicate[] predicates = criarRestricoes(salaFilter, builder, root);
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
	
	private Predicate[] criarRestricoes(SalaFilter salaFilter, CriteriaBuilder builder, Root<Sala> root) {
		List<Predicate> predicates = new ArrayList<>();
		
		if(!StringUtils.isEmpty(salaFilter.getSala())) {
			predicates.add(builder.like(builder.lower(root.get(Sala_.sala)), "%" + salaFilter.getSala().toLowerCase() + "%"));
			
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	
	
	

}
