package com.bhuvana.spring.demo.eurekaserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserviceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserviceregistryApplication.class, args);
	}

}
