package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Sala;
import com.escola.api.repository.sala.SalaRepositoryQuery;

public interface SalaRepository extends JpaRepository<Sala, Long>, SalaRepositoryQuery {

	public Page<Sala> findBySalaContaining(String sala, Pageable pageable);
}
