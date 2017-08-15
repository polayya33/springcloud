package com.poli.cloud.eureka.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.poli.cloud.eureka")
public class PoliSEurekaStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoliSEurekaStudentServiceApplication.class, args);
	}
}
