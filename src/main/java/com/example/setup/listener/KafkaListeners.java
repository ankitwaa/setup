package com.example.setup.listener;

import com.example.setup.integration.SpringIntegrationGateway;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    private SpringIntegrationGateway messageGateway;

    @Autowired
    public void setMessageGateway(SpringIntegrationGateway messageGateway) {
        this.messageGateway = messageGateway;
    }

    @StreamListener(target = "inbound_channel")
    public void consume(Message<String> message){
      log.info("Consumed message from topic:{}", message);
      messageGateway.sendToDirectChannel(message);
    }

}
