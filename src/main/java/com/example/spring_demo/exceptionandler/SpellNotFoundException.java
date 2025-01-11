package com.example.spring_demo.exceptionandler;

public class SpellNotFoundException extends RuntimeException {
    public SpellNotFoundException(String message) {
        super(message);
    }
}
