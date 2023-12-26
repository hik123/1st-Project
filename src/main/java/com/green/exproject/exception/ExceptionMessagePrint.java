package com.green.exproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionMessagePrint extends RuntimeException {
    public ExceptionMessagePrint(String message) {
        super(message);
    }
}