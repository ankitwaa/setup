package com.example.setup.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaChannel {

    @Input("inbound_channel")
    SubscribableChannel inboundChannel();

    @Input("outbound_channel")
    SubscribableChannel outboundChannel();

}
