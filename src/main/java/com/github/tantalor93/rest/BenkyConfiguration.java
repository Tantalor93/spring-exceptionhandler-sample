package com.github.tantalor93.rest;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BenkyConfiguration {

	@Bean
	public FilterRegistrationBean benkyFilterRegistration() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new BenkyFilter());
		filterRegistrationBean.addUrlPatterns("/benky/*");
		return filterRegistrationBean;
	}
}
