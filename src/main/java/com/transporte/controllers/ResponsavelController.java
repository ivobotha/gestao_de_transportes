package com.transporte.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.controllers.docs.ResponsavelControllerDocs;
import com.transporte.entities.Responsavel;
import com.transporte.service.ResponsavelService;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelController implements ResponsavelControllerDocs {

	@Autowired
	private ResponsavelService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Responsavel> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsavel findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsavel create(@RequestBody Responsavel resp) {
		return service.create(resp);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Responsavel update(@RequestBody Responsavel resp) {
		return service.update(resp);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}