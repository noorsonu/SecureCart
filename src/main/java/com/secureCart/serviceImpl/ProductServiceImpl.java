package com.secureCart.serviceImpl;

import com.secureCart.dto.ProductDTO;
import com.secureCart.entity.Product;
import com.secureCart.mapper.ProductMapper;
import com.secureCart.repository.ProductRepo;
import com.secureCart.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

	private final ProductRepo repo;
	private final ProductMapper mapper;

	@Override
	public ProductDTO create(ProductDTO dto) {

		Product product = mapper.toEntity(dto);

		repo.save(product);

		log.info("Product created {}", product.getName());

		return mapper.toDTO(product);

	}

	@Override
	public Page<ProductDTO> getAll(int page, int size, String sort) {

		Pageable pageable = PageRequest.of(page, size, Sort.by(sort));

		return repo.findAll(pageable)

				.map(mapper::toDTO);

	}

	@Override
	public ProductDTO getById(Long id) {

		return mapper.toDTO(

				repo.findById(id)

						.orElseThrow()

		);

	}

	@Override
	public ProductDTO update(Long id, ProductDTO dto) {

		Product product = repo.findById(id).orElseThrow();

		product.setName(dto.getName());

		repo.save(product);

		return mapper.toDTO(product);

	}

	@Override
	public void delete(Long id) {

		repo.deleteById(id);

	}

}