package com.mom.routingkey;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

/*
 * 
 * Routing key: É uma chave enviada junto a mensagem que o exchange 
 * usa para decidir para onde vai rotear a mensagem.
 * Agora é a hora de escrever um código que publique uma mensagem no 
 * exchange e o consumidor criado lá em cima receba isso.
 * A primeira coisa é criar uma classe de configuração para o rabbitmq:
 * 
 */
public class RabbitMQConfig {
	
	@Bean
    public Queue testeQueue() {
        return new Queue("rabbitMqSimplificado", true);
    }

    @Bean
    DirectExchange exchange() {
        return new DirectExchange("direct-exchange");
    }

    @Bean
    Binding testeBinding(Queue testeQueue, DirectExchange exchange) {
        return BindingBuilder.bind(testeQueue).to(exchange).with("teste-routing-key");
    }

}
