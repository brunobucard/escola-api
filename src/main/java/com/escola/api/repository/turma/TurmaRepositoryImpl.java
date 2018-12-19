package com.escola.api.repository.turma;

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

import com.escola.api.model.Responsavel;
import com.escola.api.model.Turma;
import com.escola.api.model.Turma_;
import com.escola.api.repository.filter.ResponsavelFilter;
import com.escola.api.repository.filter.TurmaFilter;

public class TurmaRepositoryImpl implements TurmaRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Page<Turma> filtrar(TurmaFilter turmaFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Turma> criteria = builder.createQuery(Turma.class);
		Root<Turma> root = criteria.from(Turma.class);
		
		Predicate[] predicates = criarRestricoes(turmaFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<Turma> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(turmaFilter));
	}
	
	private Long total(TurmaFilter turmaFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Turma> root = criteria.from(Turma.class);
		
		Predicate[] predicates = criarRestricoes(turmaFilter, builder, root);
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
	
	private Predicate[] criarRestricoes(TurmaFilter turmaFilter, CriteriaBuilder builder, Root<Turma> root) {
		List<Predicate> predicates = new ArrayList<>();
		
		if(!StringUtils.isEmpty(turmaFilter.getTurma())) {
			predicates.add(builder.like(builder.lower(root.get(Turma_.turma)), "%" + turmaFilter.getTurma().toLowerCase() + "%"));
			
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}



	
	
	

}
