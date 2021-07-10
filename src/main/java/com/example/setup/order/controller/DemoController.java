package com.example.setup.order.controller;

import com.example.setup.feign.FeignClient;
import com.example.setup.retry.SpringRetryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private SpringRetryHandler springRetryHandler;
    private FeignClient feignClient;

    @Autowired
    public void setSpringRetryHandler(SpringRetryHandler springRetryHandler) {
        this.springRetryHandler = springRetryHandler;
    }

    @Autowired
    public void setFeignClient(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping("demo/retry")
    public String getRetryDemo() throws Exception {
        return springRetryHandler.method();
    }

    @GetMapping("demo/feign")
    public String getFeignDemo(@RequestParam(value = "name", required = false) String name) throws Exception {
        return feignClient.retryOperation(name) + "-" + name;
    }

}
