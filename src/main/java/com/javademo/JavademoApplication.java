package com.javademo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

//@ComponentScan(basePackages = {"com.javademo.*"})
@SpringBootApplication
@EnableAutoConfiguration
@EnableRetry
@EnableAspectJAutoProxy
@EnableAsync  //@Async 生效
public class JavademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavademoApplication.class, args);
	}
}
