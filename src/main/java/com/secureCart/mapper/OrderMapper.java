package com.secureCart.mapper;

import org.mapstruct.Mapper;

import com.secureCart.dto.OrderDTO;
import com.secureCart.entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {

	OrderDTO toDTO (Order order);
	Order toEntity (OrderDTO dto);
}
