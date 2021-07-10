package com.example.setup.feign;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "demo", url = "http://localhost:9090", fallback = FeignClientFallback.class)
public interface FeignClient {

    @GetMapping("/demo/retry")
    String retryOperation();
}
