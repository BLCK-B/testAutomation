package com.blck.testAutomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAutomationApplication.class, args);
		hello();
	}

	public static void hello() {
		System.out.println("hello");
	}

}
