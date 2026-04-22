package com.secureCart.serviceImpl;

import org.springframework.stereotype.Service;

import com.secureCart.dto.PaymentDTO;
import com.secureCart.entity.Order;
import com.secureCart.entity.Payment;
import com.secureCart.enums.PaymentStatus;
import com.secureCart.mapper.PaymentMapper;
import com.secureCart.repository.OrderRepo;
import com.secureCart.repository.PaymentRepo;
import com.secureCart.service.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentServiceImpl implements PaymentService {

	private final PaymentRepo paymentRepo;
	private final OrderRepo orderRepo;
	private final PaymentMapper mapper;

	@Override
	public PaymentDTO pay(Long orderId) {

		Order order = orderRepo.findById(orderId).orElseThrow();

		double amount = 1000;

		PaymentStatus status = amount < 5000 ? PaymentStatus.SUCCESS : PaymentStatus.FAILED;

		Payment payment = Payment.builder().amount(amount).status(status).order(order).build();
		
		paymentRepo.save(payment);
		
		log.info("Payment status {}",status);

		return mapper.toDTO(payment);
	}

}

