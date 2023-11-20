package com.shakov.lesson25.exception.tasks;


import java.sql.SQLOutput;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */

public class Task5 {

    public static void main(String[] args) {

//        try {
//            unsafe();
//        } catch (RuntimeException exception) {
//            System.out.println("Catch main");
//            throw new ShakovException(exception);
//        }

        try {
            catchCustomException();
        } catch (ShakovException exception) {
//            System.out.println("catched in main");
            exception.printStackTrace();
        }

    }

    public static void unsafe() {
        throw new RuntimeException("Oops");
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("Catch in catchCustomException method");
            throw new ShakovException(exception);
        }
    }
}
