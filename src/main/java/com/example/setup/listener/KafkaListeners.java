package com.example.setup.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@Slf4j
public class KafkaListeners {

    @StreamListener(target = "inbound")
    public void consume(Message<?> message){
      log.info("Consumed message from topic:{}", message);
    }

}
