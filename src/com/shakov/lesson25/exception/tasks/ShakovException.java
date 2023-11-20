package com.shakov.lesson25.exception.tasks;

public class ShakovException extends RuntimeException {

    public ShakovException(String message) {
        super(message);
    }

    public ShakovException(Throwable cause) {
        super(cause);
    }
}
