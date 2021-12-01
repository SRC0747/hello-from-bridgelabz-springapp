package com.bridgelabz.hellofrombridgelabzspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Purpose : Simulate SpringBoot application invoking welcome message
 *
 * @author : Sampriti Roy Chowdhury
 * @version : 0.0.1
 * @since : 1-12-2021
 */

@SpringBootApplication
public class HelloFromBridgelabzSpringappApplication {

	public static void main(String[] args) {
		System.out.println("Hello from Bridgelabz");
		SpringApplication.run(HelloFromBridgelabzSpringappApplication.class, args);
	}

}
