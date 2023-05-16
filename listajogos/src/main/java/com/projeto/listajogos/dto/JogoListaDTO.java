package com.projeto.listajogos.dto;

import com.projeto.listajogos.entities.ListaJogos;

public class JogoListaDTO {
	
	private Long id;
	private String nome;
	
	public JogoListaDTO() {
		
	}
	
	public JogoListaDTO(ListaJogos entity) {
		id = entity.getId();
		nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		

}
