package com.secureCart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secureCart.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

	Optional<User>findByEmail(String email);
}
