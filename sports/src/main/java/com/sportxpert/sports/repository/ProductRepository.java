package com.sportxpert.sports.repository;

import com.sportxpert.sports.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
