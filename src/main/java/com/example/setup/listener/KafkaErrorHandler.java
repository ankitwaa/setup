package com.example.setup.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaErrorHandler {

    @StreamListener("errorChannel")
    public void consumeError(Message<?> errorMessage){
        log.error("Error found while message processing:{}", errorMessage);
    }
}
