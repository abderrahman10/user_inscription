package com.pfe.InscriptionAideFinanciere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pfe.InscriptionAideFinanciere.infrastructure.mapper")

public class InscriptionAideFinanciereApplication {

	public static void main(String[] args) {
		SpringApplication.run(InscriptionAideFinanciereApplication.class, args);
	}

}
