package com.liuheng.maptest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        // 班级80个同学投票A B C D四个景点

        String[] arr = {"A","B","C","D"};
        Map<String,Integer> map1 = new HashMap<>();

        Random rd = new Random();
        for (int i = 0; i < 80; i++) {
            int index = rd.nextInt(arr.length);
            String key = arr[index];
            int count = 1;
            if(map1.containsKey(key)){
                count = map1.get(key);
                count++;
                map1.put(key,count);
            }else {
                map1.put(key,count);
            }
        }
        map1.forEach((String key, Integer value)-> {
            System.out.println(key+"="+value);
        });

        int max = 1;
        String maxKey = "";
        for(Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(max < (int) value){
                max = (int) value;
                maxKey = key;
            }
        }
        System.out.println("投票最多的景点："+maxKey+"景点,"+max+"票");
    }
}
