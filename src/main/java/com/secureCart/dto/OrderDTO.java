package com.secureCart.dto;

import com.secureCart.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {

	private Long id;
	private Long userId;
	private OrderStatus status;
}
