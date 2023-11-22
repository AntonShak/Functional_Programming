package com.shakov.lesson28.mapreduce;

import java.util.stream.Stream;

/**
 *
 *                map        reduce
 * [1_000_000]    ->    age    ->     max
 *                                           max
 * [1_000_000]    ->    age    ->     max    ->    max
 *
 * [1_000_000]    ->    age    ->     max
 */

public class MapReduceExample {

    public static void main(String[] args) {

        Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasya"),
                new Student(45, "Sveta"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(100, "Kira")
//        ).parallel()
        ).
                map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);

    }
}
