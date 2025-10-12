package com.liuheng.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        Collections.addAll(list1, "张三,12","李四,45");

        Student[] students1 = list1.stream().map(s -> new Student(s.split(",")[0],s.split(",")[1])).toArray(Student[]::new);
        System.out.println(Arrays.toString(students1));
    }
}
