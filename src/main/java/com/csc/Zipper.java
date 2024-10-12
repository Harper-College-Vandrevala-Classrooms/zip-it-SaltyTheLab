package com.csc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zipper {
    <T, U> List<Pair<T, U>> zip(List<T> list1, List<U> list2) {
        return IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> new Pair<>(list1.get(i), list2.get(i)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Zipper zipper = new Zipper();
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("one", "two", "three");

        List<Pair<String, String>> zipped = zipper.zip(list1, list2);
        zipped.forEach(pair -> System.out.println(pair.getFirst() + "," + pair.getSecond()));
    }
}
