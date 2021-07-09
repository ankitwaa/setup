package com.example.setup.integration;


import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(errorChannel = "defaultErrorChannel")
public interface SpringIntegrationGateway {

    @Gateway(requestChannel = "directChannel")
    void sendToDirectChannel(Message<?> event);

    @Gateway(requestChannel = "executorChannel")
    void sendToExecutorChannel(Message<?> event);

}
