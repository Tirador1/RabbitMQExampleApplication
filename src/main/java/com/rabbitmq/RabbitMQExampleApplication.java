package com.rabbitmq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMQExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(RabbitMQExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(Sender sender) {
		return _ -> {
			sender.sendMessage("Hello, World!");
		};
	}
}
