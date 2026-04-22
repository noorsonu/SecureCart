package com.secureCart.service;

import com.secureCart.dto.AuthRequestDTO;
import com.secureCart.dto.AuthResponseDTO;
import com.secureCart.dto.UserDTO;

public interface AuthService {

	AuthResponseDTO login(AuthRequestDTO request);

	UserDTO register(UserDTO userDTO, String password);
}
