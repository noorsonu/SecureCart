package com.secureCart.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.*;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI api() {

		return new OpenAPI();

	}

}