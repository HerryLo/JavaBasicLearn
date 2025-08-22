package com.liuheng.example;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        Integer[] arr2 = {10,2,3,5,6,1,7,8,4,9};
//        Arrays.sort(arr2 ,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
        Arrays.sort(arr2, (o1, o2)->{
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr2));
    }
}
