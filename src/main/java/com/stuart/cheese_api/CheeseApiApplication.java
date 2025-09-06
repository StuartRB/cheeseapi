package com.stuart.cheese_api;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCosmosRepositories
public class CheeseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheeseApiApplication.class, args);
	}

}
