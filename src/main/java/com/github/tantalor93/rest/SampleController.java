package com.github.tantalor93.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.tantalor93.dto.Sample;
import com.github.tantalor93.exception.BenkyException;

@RestController
public class SampleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);


	@GetMapping("/sample")
	public ResponseEntity getSample() {
		return ResponseEntity.ok(new Sample("ahoj"));
	}

	@GetMapping("/sampleError")
	public ResponseEntity errorSample() {
		throw new BenkyException();
	}

	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public void errorHandler(Exception ex) {
		LOGGER.error("local handler", ex);
	}
}
