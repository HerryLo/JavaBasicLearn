package com.liuheng.search;

import java.util.ArrayList;

public class BaseSearch {
    public static void main(String[] args) {
        int searchNum = 12;
        int[] arr = {12,34,56,78,12,34,56,34,45};

        BaseSearc(arr, searchNum);
    }

    // 基本查找
    public static void BaseSearc(int[] arr, int searchNum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(searchNum == arr[i]) {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }
}
