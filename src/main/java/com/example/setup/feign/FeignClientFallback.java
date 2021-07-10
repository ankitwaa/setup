package com.example.setup.feign;

import org.springframework.stereotype.Component;

@Component
class FeignClientFallback implements FeignClient{

    @Override
    public String retryOperation(String name) {
        return "this is default feign response -"+name;
    }

    @Override
    public String retryOperation(Object obj) {
        return "this is default feign response -"+obj;
    }
}
