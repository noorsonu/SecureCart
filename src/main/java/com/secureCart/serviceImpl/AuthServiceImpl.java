package com.secureCart.serviceImpl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.secureCart.dto.AuthRequestDTO;
import com.secureCart.dto.AuthResponseDTO;
import com.secureCart.dto.UserDTO;
import com.secureCart.entity.User;
import com.secureCart.enums.UserRole;
import com.secureCart.mapper.UserMapper;
import com.secureCart.repository.UserRepo;
import com.secureCart.security.JwtUtil;
import com.secureCart.service.AuthService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

	private final UserRepo userRepo;
	private final UserMapper mapper;
	private final JwtUtil jwtUtil;
	private final PasswordEncoder encoder;

	@Override
	public AuthResponseDTO login(AuthRequestDTO request) {

		User user = userRepo.findByEmail(request.getEmail()).orElseThrow();

		if (!encoder.matches(request.getPassword(), user.getPassword()))
			throw new RuntimeException("Invalid password");

		String token = jwtUtil.generateToken(user.getEmail());

		log.info("User logged in {}", user.getEmail());

		return AuthResponseDTO.builder().token(token).email(user.getEmail()).role(user.getRole().name()).build();
	}

	@Override
	public UserDTO register(UserDTO userDTO, String password) {
		
		User user = mapper.toEntity(userDTO);
		
		user.setPassword(encoder.encode(password));
		
		user.setRole(UserRole.USER);
		
		userRepo.save(user);
		
		log.info("User registered {}", user.getEmail());
		
		return mapper.toDTO(user);
	}

}
