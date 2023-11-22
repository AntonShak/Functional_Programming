package com.shakov.lesson27.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    public static void main(String[] args) {

        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");

        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
//                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        List<String> list = Stream.of("11", "22", "33", "44")
                .peek(System.out::println)
                .toList();

        IntStream.range(0, 10)
                .forEach(System.out::println);

        System.out.println("--------------------");

        IntStream.iterate(0, value -> value + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);
    }
}
