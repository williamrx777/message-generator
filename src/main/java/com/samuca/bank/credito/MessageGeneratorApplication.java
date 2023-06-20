package com.samuca.bank.credito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessageGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageGeneratorApplication.class, args);
	}
		public String index() {
			return "Hello Word";

	}
}
