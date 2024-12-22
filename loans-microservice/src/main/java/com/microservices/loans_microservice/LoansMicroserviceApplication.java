package com.microservices.loans_microservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice",
				description = "Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Harsh Gupta",
						email = "harshhgupta16@gmail.com"
				)
		)
)
public class LoansMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansMicroserviceApplication.class, args);
	}

}
