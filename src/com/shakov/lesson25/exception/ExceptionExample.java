package com.shakov.lesson25.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("main was started");
        try {
            unsafe(10);
        } catch (FileNotFoundException | TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("main was ended");
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("unsafe was started");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe was ended");
    }

}
