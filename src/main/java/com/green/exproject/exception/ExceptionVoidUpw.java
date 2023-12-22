package com.green.exproject.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionVoidUpw extends RuntimeException {
    public ExceptionVoidUpw(String message) {
        super(message);
    }
}
