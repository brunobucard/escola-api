package com.escola.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.api.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {

	public Page<Sala> findBySalaContaining(String sala, Pageable pageable);
}
