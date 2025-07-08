Rabbit com Spring simplificado.

Conceitos importantes.

Mensageria é enviar mensagens entre sistemas, serviços, clientes e consumidores...

Produtor ------------ Broker(intermediário) ------------- Consumidor

AMQP - protocólo (binário usado no rabbitmq, destinado a velocidade e entrega em vez de leitura por humanos)

routing key - uma tag que especifíca um consumidor específico
headers - especificações de produtor e consumidor
body ou pay load - corpo da mensagem

exchanges - configurando trocas (usando headers, routing key, durable, ack,...)
vhost - containers de exchanges, virtualizado, verticalizado(aumento de consumidores) mas não 
horizontal( recursos de hardware ) 

4 modos de envio
Direct - tag específica
fanout - broadcast
topic - tópico definido entre os produtores e consumidores

