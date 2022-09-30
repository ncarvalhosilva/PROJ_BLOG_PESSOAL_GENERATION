package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController // define que a classe é do tipo RestController, que receberá requisições que serão compostas por: URL, verbos dos métodos HTTP e Request Body
@RequestMapping("/postagens") //mapeia e define a URL (endereço) padrão do Recurso (localhost:8080/postagens) nesse caso
@CrossOrigin(origins = "*",allowedHeaders = "*") // indica que a classe controladora permitirá o recebimento de requisições realizadas de fora do domínio ao qual ela pertence
//Em produção, recomenda-se substituir o * pelo endereço do deploy do front-end
public class PostagemController {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@GetMapping //mapeia todas as Requisições HTTP GET e indica que o Método getAll(), responderá a todas as requisições do tipo HTTP GET, enviadas no endereço "localhost"
	public ResponseEntity<List<Postagem>> getAll() {
		return ResponseEntity.ok(postagemRepository.findAll()); //o getAll é ResponseEntity pq ele responderá a Requisição HTTP (HTTP Request), com uma Resposta HTTP (HTTP Response)

	}
}
