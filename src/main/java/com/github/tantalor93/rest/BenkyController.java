package com.github.tantalor93.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.tantalor93.exception.BenkyException;

@RestController
public class BenkyController {

	@GetMapping("/benky")
	public ResponseEntity getBenky() {
		throw new BenkyException();
	}
}
