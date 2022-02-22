package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}


	//metodo HTTP GET -> seta para a raiz ou qualquer outro diretório da aplicação e retorna algo (get)
	@GetMapping("/")
	public String index(){
		return "Olá Mundo";
	}
}
