package com.capstone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capstone.service.FlightServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public FlightServiceImpl flightServiceImpl() {
		return new FlightServiceImpl();
	}

}
