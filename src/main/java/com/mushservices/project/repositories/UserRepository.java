package com.mushservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mushservices.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
