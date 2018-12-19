package com.escola.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.api.model.Serie;
import com.escola.api.repository.SerieRepository;

@RestController
@RequestMapping("/series")
public class SerieResource {
	
	@Autowired
	private SerieRepository serieRepository;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public List<Serie> listar() {
		return serieRepository.findAll();
	}

}
