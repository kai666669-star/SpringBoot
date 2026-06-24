package com.example.demo.model;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, UUID>{
	Optional<Users> findByUsername(String username);
}
