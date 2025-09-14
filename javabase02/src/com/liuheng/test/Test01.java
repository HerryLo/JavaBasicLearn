package com.liuheng.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();

        Collections.addAll(arrlist, "李三","张二","张三","李四","王五","网五");

        Random ra = new Random();
        int index = ra.nextInt(arrlist.size());
        String name = arrlist.get(index);
        System.out.println(name);
    }
}
