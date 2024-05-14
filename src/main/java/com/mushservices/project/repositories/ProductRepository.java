package com.mushservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mushservices.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
