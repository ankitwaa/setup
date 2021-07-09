package com.example.setup.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringSchedulingDemo {

    @Scheduled(initialDelay = 1000, fixedDelay = 1000)
    public void scheduledJob(){
        log.info("Scheduled Job -{}", System.currentTimeMillis());
    }

}
