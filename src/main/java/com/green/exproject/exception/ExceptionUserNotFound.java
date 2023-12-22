package com.green.exproject.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionUserNotFound extends RuntimeException {
    public ExceptionUserNotFound(String message) {
        super(message);
    }
}
