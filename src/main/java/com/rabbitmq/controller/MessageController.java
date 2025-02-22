package com.rabbitmq.controller;

import com.rabbitmq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageController {

	@Autowired
	private Sender sender;

	@PostMapping("/send")
	public String sendMessage(@RequestBody String message) {
		sender.sendMessage(message);
		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

	@GetMapping("/receive")
	public String receiveMessage() {
		return "Check the console for received messages.";
	}
}