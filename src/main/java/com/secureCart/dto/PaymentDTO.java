package com.secureCart.dto;

import com.secureCart.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

	private Long id;
	private double amount;
	private PaymentStatus status;
}
