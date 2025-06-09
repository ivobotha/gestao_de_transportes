package com.transporte.service;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transporte.controllers.ResponsavelController;
import com.transporte.entities.Responsavel;
import com.transporte.exception.ResourceNotFoundException;
import com.transporte.repositories.ResponsavelRepository;

@Service
public class ResponsavelService {
	private Logger logger = Logger.getLogger(ResponsavelService.class.getName());

	@Autowired
	private ResponsavelRepository repository;

	public List<Responsavel>  findAll() {
		logger.info("Finding all Responsavels!");
		var authors = repository.findAll();
		authors.forEach(this::addHateoasLinks);
		return authors;
	}

	public Responsavel findById(Long id) {
		logger.info("Finding one Responsavel!");
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException ("No records found for this ID!"));
		
		addHateoasLinks(entity);
		return entity;
	}

	public Responsavel create(Responsavel responsavel) {
		logger.info("Creating one Responsavel!");
		var dto = repository.save(responsavel);
		addHateoasLinks(dto);
		return dto;
	}

	public Responsavel update(Responsavel responsavel) {
		logger.info("Updating one Responsavel!");
		var entity = repository.findById(responsavel.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		
		entity.setNome(responsavel.getNome());
		entity.setEmail(responsavel.getEmail());
		entity.setTelefone(responsavel.getTelefone());
		
		addHateoasLinks(entity);
		return entity;
	}

	public void delete(Long id) {
		logger.info("Deleting one Responsavel!");
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		repository.delete(entity);
	}
	
	private void addHateoasLinks(Responsavel dto) {
		dto.add(linkTo(methodOn(ResponsavelController.class).findById(dto.getId())).withSelfRel().withType("GET"));
		dto.add(linkTo(methodOn(ResponsavelController.class).findAll()).withRel("findAll").withType("GET"));
		dto.add(linkTo(methodOn(ResponsavelController.class).create(dto)).withRel("create").withType("POST"));
		dto.add(linkTo(methodOn(ResponsavelController.class).update(dto)).withRel("update").withType("PUT"));
		dto.add(linkTo(methodOn(ResponsavelController.class).delete(dto.getId())).withRel("delete").withType("DELETE"));
		
	}
}
