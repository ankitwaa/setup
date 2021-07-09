package com.example.setup.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class RestErrorHandler {

    @ExceptionHandler
    public ResponseEntity<String> exception(Exception exception){
        log.error("error while handling request");
        return ResponseEntity.badRequest().body("error while handling request");
    }
}
