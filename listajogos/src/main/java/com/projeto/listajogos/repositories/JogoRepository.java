package com.projeto.listajogos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projeto.listajogos.entities.Jogo;
import com.projeto.listajogos.projections.JogoMinProjection;

public interface JogoRepository extends JpaRepository<Jogo, Long>{

	@Query(nativeQuery = true, value = """
			SELECT tabela_jogo.id, tabela_jogo.titulo, tabela_jogo.ano, tabela_jogo.img_url AS imgUrl,
			tabela_jogo.descricao_curta AS descricaoCurta, tabela_pertencimento.posicao
			FROM tabela_jogo
			INNER JOIN tabela_pertencimento ON tabela_jogo.id = tabela_pertencimento.jogo_id
			WHERE tabela_pertencimento.lista_id = :listaId
			ORDER BY tabela_pertencimento.posicao
				""")
	List<JogoMinProjection> searchByList(Long listaId);
}
