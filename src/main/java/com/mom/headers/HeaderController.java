package com.mom.headers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HeaderController {

	private final AmqpTemplate queueSender;
	
	public HeaderController(AmqpTemplate queueSender) {
        this.queueSender = queueSender;
    }
	
	@GetMapping
    public String send(){

        String mensagem = "test message";

        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("ultima", "sim"); //Aqui é o header da mensagem - confira no console do rabbit
        Message message = new Message(mensagem.getBytes(), messageProperties);

        queueSender.convertAndSend("teste-exchange", "routing-key-teste", message);
        return "ok. done";
    }
	
}
