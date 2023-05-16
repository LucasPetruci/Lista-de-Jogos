package com.projeto.listajogos.dto;

import com.projeto.listajogos.entities.Jogo;
import com.projeto.listajogos.projections.JogoMinProjection;

public class JogoMinDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;
	
	public JogoMinDTO() {
		
	}

	public JogoMinDTO(Jogo entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		descricaoCurta = entity.getDescricaoCurta();
	}
	
	public JogoMinDTO(JogoMinProjection projection) {
		id = projection.getId();
		titulo = projection.getTitulo();
		ano = projection.getAno();
		imgUrl = projection.getImgUrl();
		descricaoCurta = projection.getDescricaoCurta();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}

	
	
}
