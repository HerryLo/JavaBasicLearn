package com.javabase02.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, "a-1","b-1","c-1","d-1");

        arrayList.add("e-1");
        arrayList.add("f-1");
//        arrayList.add("f-1");

        arrayList.stream()
                .filter(s -> s == "a")
                .forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        Stream<String> stream1 = arrayList.stream().filter(s -> s == "e");
        stream1.forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        arrayList.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        arrayList.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        arrayList.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, "qw-1","er-1","sd-1","sd-1");
        Stream.concat(arrayList1.stream(), arrayList.stream()).forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        arrayList.stream().map(Integer::getInteger).forEach(s -> System.out.println(s));
        System.out.println("------------------------------");

        String[] arr = arrayList.stream().filter(s -> s.startsWith("a")).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------");

        ArrayList<String> newList = arrayList.stream().filter(s -> s.startsWith("a")).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(newList);
        System.out.println("------------------------------");

        Map<String,String> smap = arrayList.stream().collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[1]));
        System.out.println(smap);
        System.out.println("------------------------------");
    }
}
