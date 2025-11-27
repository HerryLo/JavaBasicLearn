package com.javabase02.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        li.add("aaa");
        li.add("bbb");
        li.add("ccc");

        li.add(1,"ddd");

        String str = new String("aaa");
        li.remove(str);

        System.out.println(li);
    }
}
