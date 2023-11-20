package com.shakov.lesson25.exception.tasks;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */

public class Task2 {

    public static void main(String[] args) {

        int[] values = {1,2,3,4,5};

        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
