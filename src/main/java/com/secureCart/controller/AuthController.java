package com.secureCart.controller;

import com.secureCart.dto.*;
import com.secureCart.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

	private final AuthService service;

	@PostMapping("/login")
	public ResponseEntity<AuthResponseDTO> login(

			@RequestBody AuthRequestDTO request) {

		return ResponseEntity.ok(service.login(request));

	}

	@PostMapping("/register")
	public ResponseEntity<UserDTO> register(

			@RequestBody UserDTO dto,

			@RequestParam String password) {

		return ResponseEntity.ok(

				service.register(dto, password)

		);

	}

}