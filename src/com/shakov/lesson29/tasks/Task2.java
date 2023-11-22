package com.shakov.lesson29.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 2. Дан список строк. Найти количество уникальных
 * строк длиной более 8 символов.
 */

public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of(
                "string-1",
                "string-2",
                "string-3",
                "string-4",
                "string-10",
                "string-10",
                "string-12",
                "string-12"
        );

        int size = strings.stream()
                .filter(string -> string.length() > 8)
                .collect(Collectors.toSet())
                .size();

        System.out.println(size);

        long size2 = strings.stream()
                .filter(string -> string.length() > 8)
                .distinct()
                .count();
        System.out.println(size2);


    }
}
