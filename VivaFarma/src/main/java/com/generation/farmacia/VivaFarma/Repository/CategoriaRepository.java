package com.generation.farmacia.VivaFarma.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.VivaFarma.Model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
	
	public List<Categoria> findAllBYNomeContainingIgnoreCase (String nome);

}
