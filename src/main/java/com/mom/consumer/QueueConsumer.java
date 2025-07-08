package com.mom.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {
	//Queue name é o nome da fila criada lá no rabbitMq
	@RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String fileBody) { // Lá no rabbit http://localhost:15672/ vai em publique messagem e crie uma mensagem e publique
        System.out.println("Message " + fileBody); // aqui ele vai publicar no console a mensagem vinda da fila
    }
	
}
