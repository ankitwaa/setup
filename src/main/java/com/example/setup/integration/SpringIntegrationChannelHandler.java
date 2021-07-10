package com.example.setup.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint
@Slf4j
public class SpringIntegrationChannelHandler {

    @ServiceActivator(inputChannel = "directChannel")
    public void handle(Message<?> events) {
        log.info("message received in direct channel:{}", events);
    }

    @ServiceActivator(inputChannel = "defaultErrorChannel", outputChannel = "errorChannel")
    public void handleError(Message<?> error) {
        log.info("error message received in direct channel");
    }
}
