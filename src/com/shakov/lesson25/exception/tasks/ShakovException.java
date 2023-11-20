package com.shakov.lesson25.exception.tasks;

public class ShakovException extends Exception {

    public ShakovException(String message) {
        super(message);
    }

    public ShakovException(Throwable cause) {
        super(cause);
    }
}
