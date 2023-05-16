package com.projeto.listajogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.listajogos.dto.JogoListaDTO;
import com.projeto.listajogos.services.JogoListaService;

@RestController
@RequestMapping(value = "/lista")
public class JogoListaController {

	@Autowired
	private JogoListaService jogoListaService;
	
	@GetMapping
	public List<JogoListaDTO> findAll(){
		List<JogoListaDTO> result = jogoListaService.findAll();
		return result;
	}
}
