package com.liuheng.test;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTest05 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("lh");
        list1.add("45646");
        list1.add("464678");
        list1.add("478909");

//        Iterator<String> it = list1.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            System.out.println(str);
//            if(str == "lh") {
//                it.remove();
//            }
//        }

//        list1.stream().forEach(item -> {
//            System.out.println(item);
//        });
        System.out.println(list1);

        String[] list2 = {"3434","564","567567"};
        ArrayList<String> list3 = Arrays.stream(list2).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list3);
    }
}
