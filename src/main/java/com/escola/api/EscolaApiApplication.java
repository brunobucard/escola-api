package com.escola.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.escola.api.config.property.EscolaApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(EscolaApiProperty.class)
public class EscolaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaApiApplication.class, args);
	}
}
