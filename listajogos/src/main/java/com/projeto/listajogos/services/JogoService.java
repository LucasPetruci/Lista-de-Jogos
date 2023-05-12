package com.projeto.listajogos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import com.projeto.listajogos.dto.JogoDTO;
import com.projeto.listajogos.dto.JogoMinDTO;
import com.projeto.listajogos.entities.Jogo;
import com.projeto.listajogos.error.ErrorException;
import com.projeto.listajogos.repositories.JogoRepository;

@Service
public class JogoService {

	@Autowired
	private JogoRepository jogoRepository;
	
	public List<JogoMinDTO> findAll(){
		List<Jogo> jogos = jogoRepository.findAll();
		
		List<JogoMinDTO> listaDTO = new ArrayList<JogoMinDTO>();
        for(Jogo jogo : jogos) {
            listaDTO.add(new JogoMinDTO(jogo));
        }
        return listaDTO;
	}
	
	
	public JogoDTO findById(Long id) {
		Jogo resultado = jogoRepository.findById(id).orElse(null);
		if(resultado == null) {
			throw new ErrorException("Jogo não existe");
		}
	
		JogoDTO dto = new JogoDTO(resultado);
		return dto;		
	}
	
//	public JogoDTO findById(Long id) {	
//		//Jogo resultado = jogoRepository.findById(id).get();			
//		Jogo resultado = jogoRepository.findById(id).orElseThrow(() -> 
//		new ResponseStatusException(HttpStatus.NOT_FOUND, "Teste"));		
//		JogoDTO dto = new JogoDTO(resultado);
//		return dto;
//			
//	}
}
