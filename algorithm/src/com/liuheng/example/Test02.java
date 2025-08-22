package com.liuheng.example;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        // 斐波拉契数列
//        int[] arr = new int[12];
//        arr[0] = 1;
//        arr[1] = 1;
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i-1]+ arr[i-2];
//        }
//        System.out.println(Arrays.toString(arr));

        // 反向递归
        System.out.println(getCount(1));
    }

    public static int getCount(int days) {
        if(days <= 0 || days > 11){
            System.out.println("当前时间错误");
            return -1;
        }

        if(days == 10){
            return 1;
        }
        return (getCount(days+1)+1)*2;
    }
}
