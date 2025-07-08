package com.mom.resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routingkey")
public class RoutingKeyTesteControler {
	
	//Esse endpoint testa o routingkey
	//o routing key é uma mensagem ou chave levada junto com o payload da mensagem
	
	private final AmqpTemplate queueSender;
	
	public RoutingKeyTesteControler(AmqpTemplate queueSender) {
        this.queueSender = queueSender;        
    }
	
	@GetMapping
    public String send(){
        queueSender.convertAndSend("teste-exchange", "routing-key-teste", "test message");
        return "ok. done";
    }

	
}
