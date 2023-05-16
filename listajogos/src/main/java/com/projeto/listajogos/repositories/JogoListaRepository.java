package com.projeto.listajogos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.listajogos.entities.ListaJogos;

public interface JogoListaRepository extends JpaRepository<ListaJogos, Long> {

}
