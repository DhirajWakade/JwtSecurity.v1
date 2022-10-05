package com.dw.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistoryApplication {

	static Logger logger =LoggerFactory.getLogger(ServiceRegistoryApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistoryApplication.class, args);
		logger.info("*******REGISTRY-SERVICE Started********");
	}

}
