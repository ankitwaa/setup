package com.example.setup.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.ExecutorChannel;
import org.springframework.messaging.MessageChannel;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class SpringIntegrationChannel {

    @Bean("directChannel")
    MessageChannel getMainChannel(){
        return new DirectChannel(); // direct channel is syschonous..message handler logic executes in the same thread.
    }

    @Bean("executorChannel")
    MessageChannel getExecutorChannel(){
        // ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 10, 10, new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.CallerRunsPolicy());
        return new ExecutorChannel(Executors.newSingleThreadExecutor());
    }

}
