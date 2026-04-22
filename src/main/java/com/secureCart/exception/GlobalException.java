package com.secureCart.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(RuntimeException.class)

	public ResponseEntity<String> handle(

			RuntimeException ex) {

		return new ResponseEntity<>(

				ex.getMessage(),

				HttpStatus.BAD_REQUEST

		);

	}

}