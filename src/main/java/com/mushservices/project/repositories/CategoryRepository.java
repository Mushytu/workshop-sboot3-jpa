package com.mushservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mushservices.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
