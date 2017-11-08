package com.spring.zj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerMain2 {

	public static void main(String[] args) {
		SpringApplication.run(ServerMain2.class, args);
	}
}
