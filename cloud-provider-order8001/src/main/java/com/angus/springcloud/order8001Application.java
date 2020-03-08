package com.angus.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author angus
 * @create 2020-03-07 17:37
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.angus"})
public class order8001Application {
	public static void main(String[] args) {
		SpringApplication.run(order8001Application.class, args);
	}
}
