package org.generation.farmaciadagen.repository;

import java.util.List;

import org.generation.farmaciadagen.model.ProdutoFarma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoFarma, Long> {
	 public List<ProdutoFarma> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
