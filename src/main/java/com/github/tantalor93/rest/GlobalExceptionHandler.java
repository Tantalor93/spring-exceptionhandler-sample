package com.github.tantalor93.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.github.tantalor93.exception.BenkyException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(BenkyException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ResponseEntity handle() {
		LOGGER.error("global handler");
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("global error");
	}
}
