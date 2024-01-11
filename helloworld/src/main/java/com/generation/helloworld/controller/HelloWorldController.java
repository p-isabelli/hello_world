package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsms")
	public String mostraBSMs() {
		return "Persistência, mentalidade de crescimento, responsabilidade pessoal, orientação ao futuro,"
				+ "orientação ao detalhe, trabalho em equipe, comunicação, proatividade";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Aprender Spring Boot, entregar as tarefas em dia e aprender a usar banco de dados";
	}
	
}
