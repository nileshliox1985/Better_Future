package com.hackzurich.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.hackzurich")
@EnableWebMvc
public class BetterFutureApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetterFutureApplication.class, args);
	}

}
