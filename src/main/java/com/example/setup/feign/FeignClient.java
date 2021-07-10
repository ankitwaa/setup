package com.example.setup.feign;

import feign.Body;
import feign.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(name = "demo", url = "http://localhost:9090", fallback = FeignClientFallback.class)
public interface FeignClient {

    @GetMapping("/demo/retry?name={name}")
    String retryOperation(@Param("name") String name);

    @PostMapping("/demo/feign/post")
    String retryOperation(@RequestBody Object obj);
}
