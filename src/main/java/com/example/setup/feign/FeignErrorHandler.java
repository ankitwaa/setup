package com.example.setup.feign;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

@Slf4j
public class FeignErrorHandler implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        log.error("Error Occurred while remote invocation:{}", response.request().url());
        log.error("Error Response:{}", "this is the response");
        return new Exception("error while method invocation");
    }

}
