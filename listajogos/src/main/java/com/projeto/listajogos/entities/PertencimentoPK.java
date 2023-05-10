package com.projeto.listajogos.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class PertencimentoPK {
	
	@ManyToOne
	@JoinColumn(name = "jogo_id")
	private Jogo jogo;
	
	@ManyToOne
	@JoinColumn(name = "lista_id")
	private ListaJogos listaJogos;
	
	public PertencimentoPK() {
		
	}

	public PertencimentoPK(Jogo jogo, ListaJogos listaJogos) {
		super();
		this.jogo = jogo;
		this.listaJogos = listaJogos;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public ListaJogos getListaJogos() {
		return listaJogos;
	}

	public void setListaJogos(ListaJogos listaJogos) {
		this.listaJogos = listaJogos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jogo, listaJogos);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PertencimentoPK other = (PertencimentoPK) obj;
		return Objects.equals(jogo, other.jogo) && Objects.equals(listaJogos, other.listaJogos);
	}

}
