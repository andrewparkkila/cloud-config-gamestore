package com.trilogyed.cloudconfiggamestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigGamestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigGamestoreApplication.class, args);
	}

}
