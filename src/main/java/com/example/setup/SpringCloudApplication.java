package com.example.setup;

import com.example.setup.stream.KafkaChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableRetry
@EnableScheduling
@EnableCaching
@EnableIntegration
@EnableBinding(KafkaChannel.class)
@SpringBootApplication
public class SpringCloudApplication{
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
    }
}

