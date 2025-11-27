package com.javabase02.test;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTest04 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("lh",23);
        map.put("ww","87");
        map.put("lh","56"); // 修改

        Set<Map.Entry<String, Object>> entrys = map.entrySet();
        Iterator<Map.Entry<String, Object>> entryIt = entrys.iterator();
        while (entryIt.hasNext()) {
            Map.Entry<String, Object> entry = entryIt.next();
            String key = entry.getKey();
            Object value = entry.getValue();

            System.out.println("iterator: "+key + "=" + value);
//            entryIt.remove(); // 移除元素
        }

        System.out.println(map);
        for ( String key : map.keySet()) {
            System.out.println("keySet: "+key);
        }

        for( Map.Entry<String,Object> entry : map.entrySet() ){
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("entrySet: "+key + "=" + value);
        }

        // 使用stream流
        Map<String,Object> maplist = map.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(),entry -> entry.getValue()));
        maplist.entrySet().stream().forEach((entry) -> {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("stream流: "+key + "=" + value);
        });
    }
}
