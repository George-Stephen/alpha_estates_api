package com.infinie.alpha_estate_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.infinie.alpha_estate_api"})
public class  AlphaEstateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphaEstateApiApplication.class, args);
	}

}
