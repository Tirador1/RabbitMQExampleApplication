package com.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Receiver {
	@RabbitListener(queues = "hello")
	public void receiveMessage(String message) {
		log.info("Received message: {}", message);
	}
}