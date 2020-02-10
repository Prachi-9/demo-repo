package com.example.sampleRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class SampleRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestApplication.class, args);
	}

}
