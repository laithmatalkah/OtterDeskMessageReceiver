package com.task4.otterdesk.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class MessageReceiver {

    private final Logger logger = LoggerFactory.getLogger(MessageReceiver.class.getName());




    @RabbitListener(queues="BluePrints", containerFactory="jsaFactory")
    public void receive(BluePrint bluePrint) {
        logger.info("Received print [" + bluePrint + "]");

    }


}