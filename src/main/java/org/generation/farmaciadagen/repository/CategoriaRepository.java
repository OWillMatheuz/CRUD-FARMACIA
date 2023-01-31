package org.generation.farmaciadagen.repository;

import java.util.List;

import org.generation.farmaciadagen.model.CategoriaFarma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaFarma, Long>{
	public List<CategoriaFarma> findAllByGenericoOriginalContainingIgnoreCase(@Param("genericoOriginal")String genericoOriginal);
	public List<CategoriaFarma> findAllByCategoriaProdutoContainingIgnoreCase(@Param("categoriaProduto")String categoriaProduto);
}
