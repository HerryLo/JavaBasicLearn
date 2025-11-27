package com.javabase02.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//        arr.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张三，20", "李四，22", "王五，25", "赵六，27");
        Map<String, String> smap = arrayList.stream()
                .filter(s -> Integer.parseInt(s.split("，")[1]) > 24)
                .collect(Collectors.toMap(s -> s.split("，")[0], s -> s.split("，")[1]));
//        System.out.println(smap);

        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womanList = new ArrayList<>();

        Collections.addAll(manList, "张三三，20", "李四，22", "王五，25", "赵六，27", "赵八一，27", " 赵八亿，27");
        Collections.addAll(womanList, "杨晓梅，20", "杨小美，22", "杨小妹，25", "小眉，25", "小没，25", "小妹美，25");

        Stream arr1 = manList.stream().filter(s -> s.split("，")[0].length() == 3).limit(2);
        System.out.println("---------------------------");

        Stream arr2 = womanList.stream().filter(s -> s.startsWith("杨")).skip(1);
        System.out.println("---------------------------");

        Stream<String> arr3 = Stream.concat(arr1, arr2);
        List<Actor> list1 = arr3.map(s -> new Actor(s.split("，")[0], s.split("，")[1])).collect(Collectors.toList());
        System.out.println(list1);
    }
}
