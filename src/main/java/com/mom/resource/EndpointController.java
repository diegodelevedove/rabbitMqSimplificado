package com.mom.resource;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mom.sender.QueueSender;

@RestController
@RequestMapping("/testarEnviarDoBrownser")
public class EndpointController {

	@Autowired
    private QueueSender queueSender;

	
	//Enviando do brownser pro console
	//http://localhost:8080/testarEnviarDoBrownser
    @GetMapping
    public String send(){
        queueSender.send("Enviando mensagem do Browser capturando no console");
        return "Enviado, mensagem ok";
    }
	
    
	
}
