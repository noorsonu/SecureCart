package com.secureCart.security;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import lombok.RequiredArgsConstructor;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

	private final JwtUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)

			throws ServletException, IOException {

		String header = request.getHeader("Authorization");

		if (header != null && header.startsWith("Bearer ")) {

			String token = header.substring(7);

			if (jwtUtil.validateToken(token)) {

				String email = jwtUtil.extractUsername(token);

				UsernamePasswordAuthenticationToken auth =

						new UsernamePasswordAuthenticationToken(email, null, null);

				SecurityContextHolder.getContext().setAuthentication(auth);

			}

		}

		chain.doFilter(request, response);

	}

}