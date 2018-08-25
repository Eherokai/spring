package com.dafy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InitialApplication {

	public static void main(String[] args) {
		System.out.println("");
		SpringApplication.run(InitialApplication.class, args);
	}
}
