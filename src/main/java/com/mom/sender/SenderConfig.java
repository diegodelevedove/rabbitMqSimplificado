package com.mom.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SenderConfig {
	
	
	//Essa classe cria um bean de Queue que será utilizado no envio das mensagens.
	//Logo depois uma classe que de fato faz o envio das mensagens:QueueSender
	@Value("${queue.name}")
    private String message;

    @Bean
    public Queue queue() {
        return new Queue(message, true);
    }

}
