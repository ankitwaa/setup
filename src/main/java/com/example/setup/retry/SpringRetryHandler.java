package com.example.setup.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
/**
 * Note Retryable and Recovery method must have same return and args
 *
 */
public class SpringRetryHandler {


    @Retryable(maxAttempts = 5, value = Exception.class, backoff = @Backoff(delay = 100))
    public void method() throws Exception{
      log.info("retrying....");
      throw new Exception("No Such Implementation");
    }

    @Recover
    public void recoveryMethod(){
        log.info("Gone to recovery method after retry");
    }

}
