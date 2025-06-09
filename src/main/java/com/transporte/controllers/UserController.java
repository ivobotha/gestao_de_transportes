package com.transporte.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transporte.entities.User;
import com.transporte.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping
	public List<EntityModel<User>> getAll() {
		return service.findAll().stream()
				.map(user -> EntityModel.of(user, WebMvcLinkBuilder
						.linkTo(WebMvcLinkBuilder.methodOn(UserController.class).getById(user.getId())).withSelfRel()))
				.collect(Collectors.toList());
	}

	@GetMapping("/{id}")
	public EntityModel<User> getById(@PathVariable Long id) {
		User user = service.findById(id).orElseThrow();
		return EntityModel.of(user,
				WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserController.class).getById(id)).withSelfRel());
	}

	@PostMapping
	public User create(@RequestBody User user) {
		return service.save(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
