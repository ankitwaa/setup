package com.example.setup.feign;

import org.springframework.stereotype.Component;

@Component
class FeignClientFallback implements FeignClient{

    @Override
    public String retryOperation() {
        return "this is default feign response";
    }
}
