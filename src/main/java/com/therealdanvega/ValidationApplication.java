package com.therealdanvega;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CityRepository cityRepository){
	    return args -> {
			cityRepository.save( new City("Cleveland") );
		};
	}
}