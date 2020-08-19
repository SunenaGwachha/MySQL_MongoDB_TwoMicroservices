package com.example.execute.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMongoDbApplication.class, args);
	}

}
