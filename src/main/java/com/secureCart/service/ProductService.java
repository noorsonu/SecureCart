package com.secureCart.service;

import org.springframework.data.domain.Page;

import com.secureCart.dto.ProductDTO;

public interface ProductService {
	
	ProductDTO create (ProductDTO dto);
	
	ProductDTO getById(Long id);
	
	Page<ProductDTO>getAll(int page, int size, String sort);
	
	ProductDTO update (Long id, ProductDTO dto);
	
	void delete (Long id);
}
