package com.shakov.lesson25.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("main was started");
        try {
            System.out.println(finallyTest());
            unsafe(10);
        } catch (FileNotFoundException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
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

    public static int finallyTest() {
        try {
            return 2;
        } catch (Throwable throwable) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafeWithRuntime(int value) {
        System.out.println("unsafe was started");
        if (value > 0) {
            throw new RuntimeException();
        }
        System.out.println("unsafe was ended");
    }

}
