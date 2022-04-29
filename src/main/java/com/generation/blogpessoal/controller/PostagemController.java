package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins="*")
public class PostagemController {
	
	// tranfere a responsabilidade de contruir as consultas no banco de dados para o repository
	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public List<Postagem> getAll() {
		return repository.findAll();
	}
}
