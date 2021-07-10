package com.example.setup.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaListeners {

    @StreamListener(target = "inbound_channel")
    public void consume(Message<String> message){
      log.info("Consumed message from topic:{}", message);
    }

}
