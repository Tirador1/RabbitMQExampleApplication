package com.rabbitmq.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
@RequiredArgsConstructor
@ConfigurationPropertiesScan("com.rabbitmq.config")
@Slf4j
public class ApplicationConfig {
	@Bean
	public Queue helloQueue() {
		return new Queue("hello");
	}
}
