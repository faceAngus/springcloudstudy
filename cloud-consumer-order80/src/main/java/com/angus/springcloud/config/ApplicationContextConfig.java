package com.angus.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author angus
 * @create 2020-03-07 11:37
 */
@Configuration
public class ApplicationContextConfig {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
