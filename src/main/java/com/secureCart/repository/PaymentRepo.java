package com.secureCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secureCart.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
