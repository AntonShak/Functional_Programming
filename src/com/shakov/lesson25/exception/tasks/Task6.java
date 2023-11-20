package com.shakov.lesson25.exception.tasks;

import com.sun.tools.javac.Main;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

/**
 * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */

public class Task6 {

    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException(),
            1, new FileNotFoundException(),
            2, new IndexOutOfBoundsException()
    );


    public static void main(String[] args) {

        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (FileNotFoundException e){
            System.out.println("fileNotFound");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("indexOutOfBounds");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("runTime");
            e.printStackTrace();
        } catch(Throwable t) {
            System.out.println("Throwable");
            t.printStackTrace();
        }

    }

    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new ShakovException("not found"));
        throw exception;
    }
}
