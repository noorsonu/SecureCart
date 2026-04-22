package com.secureCart.controller;

import com.secureCart.dto.PaymentDTO;
import com.secureCart.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

	private final PaymentService service;

	@PostMapping("/{orderId}")
	public ResponseEntity<PaymentDTO> pay(

			@PathVariable Long orderId) {

		return ResponseEntity.ok(service.pay(orderId));

	}

}