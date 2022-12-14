package com.example.gallihe.foo.excetion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnsuportedMathOperationException(String exception) {
        super(exception);
    }
}
