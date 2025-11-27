package com.javabase02.maptest;

import java.util.TreeMap;

public class Test03 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student st1 = new Student(20, "lh");
        Student st2 = new Student(18, "lg");
        Student st3 = new Student(56, "qewq");

        tm.put(st1, "12");
        tm.put(st2, "34");
        tm.put(st3, "56");

        System.out.println(tm);
        tm.forEach((key, value)-> {
            System.out.println(key+","+value);
        });
    }
}
