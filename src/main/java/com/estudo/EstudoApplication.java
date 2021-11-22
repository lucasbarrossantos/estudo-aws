package com.estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
public class EstudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
	}

	@GetMapping("/health-check")
	public ResponseEntity<String> healthCheck() {
		System.out.println("Atualizado em: " + LocalDateTime.now());
		return ResponseEntity.ok("No ar!!!");
	}

}
