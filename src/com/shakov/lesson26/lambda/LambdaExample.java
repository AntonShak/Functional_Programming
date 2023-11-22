package com.shakov.lesson26.lambda;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {

//        Comparator<Integer> comparator = (Integer int1, Integer int2) -> {
//            return Integer.compare(int1, int2);
//        };

//        Comparator<Integer> comparator = (int1, int2) -> Integer.compare(int1, int2);

        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(25,100));


    }

//    private static class IntegerComparator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
//    }
}
