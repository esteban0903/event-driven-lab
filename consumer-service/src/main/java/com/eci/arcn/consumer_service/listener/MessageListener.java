package com.eci.arcn.consumer_service.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void receiveMessage(String message) {
        log.info("Mensaje recibido: '{}'", message);
        System.out.println(">>> Mensaje Procesado: " + message);
    }
}
