package com.secureCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secureCart.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
