package com.devsuperior.meuprimeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.meuprimeiroprojeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}