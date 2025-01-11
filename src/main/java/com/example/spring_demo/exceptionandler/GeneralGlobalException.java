package com.example.spring_demo.exceptionandler;

public class GeneralGlobalException extends RuntimeException {
    public GeneralGlobalException(String message) {
        super(message);
    }
}
