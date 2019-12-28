package com.github.tantalor93.rest;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import com.github.tantalor93.exception.BenkyException;

public class BenkyFilter extends OncePerRequestFilter {

	private static final Logger LOGGER = LoggerFactory.getLogger(BenkyFilter.class);



	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain) throws ServletException, IOException {


		throw new BenkyException();
	}
}
