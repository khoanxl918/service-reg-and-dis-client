package com.example.servicereganddisclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceRegAndDisClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegAndDisClientApplication.class, args);
	}

}
