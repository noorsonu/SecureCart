package com.secureCart.service;

import com.secureCart.dto.PaymentDTO;

public interface PaymentService {

	PaymentDTO pay(Long orderId);
}
