package com.mushservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mushservices.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
