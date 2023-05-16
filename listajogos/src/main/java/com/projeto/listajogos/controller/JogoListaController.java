package com.projeto.listajogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.listajogos.dto.JogoListaDTO;
import com.projeto.listajogos.dto.JogoMinDTO;
import com.projeto.listajogos.services.JogoListaService;
import com.projeto.listajogos.services.JogoService;

@RestController
@RequestMapping(value = "/lista")
public class JogoListaController {

	@Autowired
	private JogoListaService jogoListaService;
		
	@Autowired
	private JogoService jogoService;
	
	@GetMapping
	public List<JogoListaDTO> findAll(){
		List<JogoListaDTO> result = jogoListaService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listaId}/jogos")
	public List<JogoMinDTO> findByLista(@PathVariable Long listaId){
		List<JogoMinDTO> listaMinJogos = jogoService.findByList(listaId);
		return listaMinJogos;
	}
}
