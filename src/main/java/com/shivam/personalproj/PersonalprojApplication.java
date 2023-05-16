package com.shivam.personalproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PersonalprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalprojApplication.class, args);
		
		System.out.println("Hello Singh");
	}

}
