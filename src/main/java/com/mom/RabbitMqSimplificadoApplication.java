package com.mom;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit // anotação importante do rabbitMQ
@SpringBootApplication
public class RabbitMqSimplificadoApplication {

	
	//lembrar de inicializar o rabbit no container do docker 
	//# latest RabbitMQ 4.x
	//https://www.rabbitmq.com/docs/download
	//docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4-management
	//http://localhost:15672/
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqSimplificadoApplication.class, args);
	}

}
