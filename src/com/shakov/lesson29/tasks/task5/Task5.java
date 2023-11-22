package com.shakov.lesson29.tasks.task5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 5. Дан класс Person с полями firstName, lastName,
 * age.
 * Вывести полное имя самого старшего человека, у
 * которого длина этого имени не превышает 15
 * символов.
 */

public class Task5 {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person(20, "Ivan", "Ivanov"),
                new Person(25, "Petr", "Petrov"),
                new Person(33, "Sveta", "Svetikova"),
                new Person(25l, "Kate", "Ivanova"),
                new Person(18, "Slava", "Slavikov"),
                new Person(56, "Arni", "Kutuzov")
        );

        persons.stream()
                .filter(person -> person.getFullName().length() <= 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
//  Представим наших Person в виде Map K=age V=Person

        Map<Integer, List<Person>> map = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map);
    }
}
