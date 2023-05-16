package com.projeto.listajogos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.listajogos.dto.JogoListaDTO;
import com.projeto.listajogos.dto.JogoMinDTO;
import com.projeto.listajogos.entities.Jogo;
import com.projeto.listajogos.entities.ListaJogos;
import com.projeto.listajogos.repositories.JogoListaRepository;

@Service	
public class JogoListaService {

	@Autowired
	private JogoListaRepository jogoListaRepository;
	
	@Transactional(readOnly = true)
	public List<JogoListaDTO> findAll(){
		List<ListaJogos> jogos = jogoListaRepository.findAll();		
		List<JogoListaDTO> listaDTO = new ArrayList<JogoListaDTO>();
		
		for (ListaJogos listaJogos : jogos) {
			listaDTO.add(new JogoListaDTO(listaJogos));
		}
		return listaDTO;
	}
	
}
