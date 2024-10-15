package com.example.servicea1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceA1Application {
	public static void main(String[] args) {
		SpringApplication.run(ServiceA1Application.class, args);
	}
}
