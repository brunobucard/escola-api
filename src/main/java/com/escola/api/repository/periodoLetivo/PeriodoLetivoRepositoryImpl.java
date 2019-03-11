package com.escola.api.repository.periodoLetivo;

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

import com.escola.api.model.PeriodoLetivo;
import com.escola.api.model.PeriodoLetivo_;
import com.escola.api.model.Sala;
import com.escola.api.model.Sala_;
import com.escola.api.repository.filter.PeriodoLetivoFilter;
import com.escola.api.repository.filter.SalaFilter;

public class PeriodoLetivoRepositoryImpl implements PeriodoLetivoRepositoryQuery {
	
	
	@PersistenceContext
	private EntityManager manager;
	
	public Page<PeriodoLetivo> filtrar(PeriodoLetivoFilter periodoLetivoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<PeriodoLetivo> criteria = builder.createQuery(PeriodoLetivo.class);
		Root<PeriodoLetivo> root = criteria.from(PeriodoLetivo.class);
		
		Predicate[] predicates = criarRestricoes(periodoLetivoFilter, builder, root);
		criteria.where(predicates);
		
		TypedQuery<PeriodoLetivo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);
		
		return new PageImpl<>(query.getResultList(), pageable, total(periodoLetivoFilter));
	}
	
	private Long total(PeriodoLetivoFilter periodoLetivoFilter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<PeriodoLetivo> root = criteria.from(PeriodoLetivo.class);
		
		Predicate[] predicates = criarRestricoes(periodoLetivoFilter, builder, root);
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
	
	// TODO acrescentar restricao por Periodo Letivo ativo(Boolean)
	private Predicate[] criarRestricoes(PeriodoLetivoFilter periodoLetivoFilter, CriteriaBuilder builder, Root<PeriodoLetivo> root) {
		List<Predicate> predicates = new ArrayList<>();
		
		if(!StringUtils.isEmpty(periodoLetivoFilter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(PeriodoLetivo_.descricao)), "%" + periodoLetivoFilter.getDescricao().toLowerCase() + "%"));
			
		}
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
}
