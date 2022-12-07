package ru.hogwarts.schoolfour;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SchoolFourApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolFourApplication.class, args);
	}

}
