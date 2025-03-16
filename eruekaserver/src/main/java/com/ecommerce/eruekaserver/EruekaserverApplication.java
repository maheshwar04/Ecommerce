package com.ecommerce.eruekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EruekaserverApplication.class, args);
	}
}
