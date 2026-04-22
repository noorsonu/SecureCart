package com.secureCart.mapper;

import org.mapstruct.Mapper;

import com.secureCart.dto.PaymentDTO;
import com.secureCart.entity.Payment;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

	PaymentDTO toDTO (Payment payment);
	Payment toEntity (PaymentDTO dto);
}
