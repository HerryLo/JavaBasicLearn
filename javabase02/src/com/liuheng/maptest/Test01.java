package com.liuheng.maptest;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
//        Map<String,String> map1 = new HashMap<>();
//
//        map1.put("name","lh");
//        map1.put("age","18");
//        map1.put("sex","0101");
//
//        for (Map.Entry<String,String> entry : map1.entrySet()){
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+"="+value);
//        }

        Map<Student,String> map2 = new HashMap<>();

        Student st1 = new Student(20, "lh");
        Student st2 = new Student(18, "lg");
        Student st3 = new Student(20, "lh");

        map2.put(st1, "shanghai");
        map2.put(st2, "beijing");
        String value3 = map2.put(st3, "shengzhen");
        System.out.println(value3);

        for (Map.Entry<Student,String> entry : map2.entrySet()){
            Student st = entry.getKey();
            String value = entry.getValue();
            System.out.println(st.getName() +","+st.getAge()+"="+value);
        }
    }
}
