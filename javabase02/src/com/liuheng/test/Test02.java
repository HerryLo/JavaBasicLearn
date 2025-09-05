package com.liuheng.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();

        Collections.addAll(boylist, "张三","李四","王五","赵六","钱八","孙九");
        Collections.addAll(girllist,"小美","小惠","小董","小薇","小丽","小妹");

        int[] arr = {1,1,1,1,1,1,1,0,0,0};
        Random rd = new Random();
        int rdnum = rd.nextInt(arr.length);
        int num = arr[rdnum];
        if(num == 1) {
            int index = rd.nextInt(boylist.size());
            String name = boylist.get(index);
            System.out.println(name);
        }else if(num == 0){
            int index = rd.nextInt(girllist.size());
            String name = girllist.get(index);
            System.out.println(name);
        }
    }
}
