package com.ac.exception;

import org.springframework.validation.Errors;

/**
 * @author wenqing.chen  2021/10/12 14:09
 **/
public class BookException extends RuntimeException {

    private String message;

    private Errors errors;

    public BookException() {
        super();
    }

    public BookException(String message) {
        super(message);
        this.message = message;
    }

    public BookException(Errors errors) {
        this.errors = errors;
    }

    public Errors getErrors() {
        return errors;
    }
}
