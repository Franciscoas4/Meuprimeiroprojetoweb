package com.devsuperior.meuprimeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.meuprimeiroprojeto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}