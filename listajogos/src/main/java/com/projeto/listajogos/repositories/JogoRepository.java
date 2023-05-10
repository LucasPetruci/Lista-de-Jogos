package com.projeto.listajogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.listajogos.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{

	
}
