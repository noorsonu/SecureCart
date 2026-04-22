package com.secureCart.controller;

import com.secureCart.dto.ProductDTO;
import com.secureCart.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService service;

	@PostMapping
	public ResponseEntity<ProductDTO> create(

			@RequestBody ProductDTO dto) {

		return ResponseEntity.ok(service.create(dto));

	}

	@GetMapping
	public ResponseEntity<Page<ProductDTO>> getAll(

			@RequestParam int page,

			@RequestParam int size,

			@RequestParam String sort) {

		return ResponseEntity.ok(

				service.getAll(page, size, sort)

		);

	}

}