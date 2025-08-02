package com.liuheng.datatype;

import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr1 = {12,34,56,67};
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"com/liuheng", "wangyi", "liwu"};
        for (String s : arr2) {
            System.out.println(s);
        }

        double[] arr3 = {1.23, 1.56, 1.98};
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[10];
        arr4[3] =243;
        System.out.println(Arrays.toString(arr4));

    }
}
