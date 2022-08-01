package com.example.Amadeous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AmadeousApplication {




	public static void main(String[] args) {
		VoyageRestService.createList();
		SpringApplication.run(AmadeousApplication.class, args);
	}


}
