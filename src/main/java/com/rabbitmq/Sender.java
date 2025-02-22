package com.rabbitmq;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Sender {

	private final RabbitTemplate rabbitTemplate;

	public void sendMessage(String message) {
		rabbitTemplate.convertAndSend("hello", message);
	}
}