package com.example.ProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication extends ServletInitializer{

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
		System.out.println("Hello World");
	}

}
