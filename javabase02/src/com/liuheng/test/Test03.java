package com.liuheng.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();
        ArrayList<String> arrlist2 = new ArrayList<>();

        Collections.addAll(arrlist, "李三","张二","张三","李四","王五","网五");
        int len = arrlist.size();
        int count = 1;

        while (count < 10){
            System.out.println("========="+count+"次=========");
            for (int i = 0; i < len; i++) {
                Random ra = new Random();
                int index = ra.nextInt(arrlist.size());
                String name = arrlist.remove(index);
                arrlist2.add(name);
                System.out.println(name);
            }
            arrlist.addAll(arrlist2);
            arrlist2.clear();
            count++;
        }
    }
}
