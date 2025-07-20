package com.example.BishopPrototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.T1Debut", "com.example.BishopPrototype"})
public class BishopPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BishopPrototypeApplication.class, args);
	}

}
