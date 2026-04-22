package com.secureCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secureCart.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Long>{

}
