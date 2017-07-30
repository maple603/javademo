package com.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.javademo.*"})
@SpringBootApplication
@EnableAutoConfiguration
public class JavademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavademoApplication.class, args);
	}
}
