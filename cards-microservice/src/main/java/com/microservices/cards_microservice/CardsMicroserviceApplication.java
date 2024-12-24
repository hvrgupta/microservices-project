package com.microservices.cards_microservice;

import com.microservices.cards_microservice.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards Microservices",
				description = "Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Harsh Gupta",
						email = "harshhgupta16@gmail.com"
				)
		)
)
public class CardsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsMicroserviceApplication.class, args);
	}

}
