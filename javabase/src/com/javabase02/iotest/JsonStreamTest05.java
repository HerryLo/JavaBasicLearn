package com.javabase02.iotest;

import com.alibaba.fastjson2.JSON;
import com.javabase02.reflectiontest.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonStreamTest05 {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();

        Person p1 = new Person(18, "we");
        Person p2 = new Person(45, "er");

        Collections.addAll(list1, p1, p2);

        String jsonOutput = JSON.toJSONString(p1);
        System.out.println(jsonOutput);
    }
}
