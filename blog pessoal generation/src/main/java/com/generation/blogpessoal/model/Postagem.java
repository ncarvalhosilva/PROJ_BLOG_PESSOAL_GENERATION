package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id //PRA IDENTIFICAR QUE ESSA VARIÁVEL É UMA PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY) //PRA TORNAR MEU ID AUTO_INCREMENT
	private Long id; //LONG É COMO O BIGINT NO MYSQL // A CLASSE É PUBLICA MAS O ID É PRIVATE
	
	@NotBlank //TORNA NOT NULL
	@Size(min = 2, max = 50) //DEFINE O TAMANHO DE CARACTERES PRO PROGRAMA NÃO FICAR PESADO
	private String titulo;
	
	@NotBlank
	@Size(max = 1000) //POSSO DEFINIR APENAS O MÁX OU APENAS O MÍNIMO TBM // 
	private String texto;
	
	@UpdateTimestamp //CONFIGURA DATA PARA SER ATUALIZADA AUTOMATICAMENTE
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	
	//GERAR GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
