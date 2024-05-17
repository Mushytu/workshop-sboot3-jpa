package com.mushservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mushservices.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
