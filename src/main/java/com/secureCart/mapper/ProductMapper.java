package com.secureCart.mapper;

import org.mapstruct.Mapper;

import com.secureCart.dto.ProductDTO;
import com.secureCart.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	ProductDTO toDTO(Product product);
	Product toEntity(ProductDTO dto);
}
