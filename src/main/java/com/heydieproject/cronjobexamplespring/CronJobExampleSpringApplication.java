package com.heydieproject.cronjobexamplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan("src.main.java.com.heydieproject.cronjobexamplespring.Entity")
@EnableScheduling
public class CronJobExampleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronJobExampleSpringApplication.class, args);
	}

}
