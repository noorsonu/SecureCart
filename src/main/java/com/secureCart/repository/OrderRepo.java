package com.secureCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secureCart.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
