package com.example.servicea2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceA2Application {
	public static void main(String[] args) {
		SpringApplication.run(ServiceA2Application.class, args);
	}
}