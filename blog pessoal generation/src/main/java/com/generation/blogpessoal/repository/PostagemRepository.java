package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

@Repository //indica que a Interface é do tipo repositório,ou seja, responsável pela interação com o Banco de dados através dos métodos padrão
public interface PostagemRepository extends JpaRepository<Postagem, Long> { 
	//o parâmetro Postagem é a Entidade que será mapeada em nosso Banco de dados
	//o parâmetro Long representa a nossa Primary Key, que é o atributo que recebeu a
	//anotação @Id na nossa Classe Postagem (o atributo também se chama id em nossa Classe Postagem).

	//Estes 2 parâmetros são do tipo Java Generics (podem receber qqr tipo de Objeto <T, T>)
	
}
