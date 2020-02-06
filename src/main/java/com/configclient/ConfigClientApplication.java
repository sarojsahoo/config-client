package com.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;

@SpringBootApplication
public class ConfigClientApplication {



	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}




}
