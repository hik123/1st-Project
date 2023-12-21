package com.green.exproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductPkNotFoundException extends RuntimeException {
    public ProductPkNotFoundException(String message) {
        super(message);
    }
}