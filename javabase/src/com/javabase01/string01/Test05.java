package com.javabase01.string01;

public class Test05 {
    public static void main(String[] args) {
        // 数组转成字符串
        // 将数组转通过字符串拼接，转换成字符串："[1,2,3]"，并打印出来
        int[] arr = {123123,456456,1231};

        arrayTransfer(arr);
    }

    public static void arrayTransfer(int[] arr) {
        if(arr.length == 0) {
            System.out.println("[]");
            return;
        }

        String result = "[";
        for(int i=0;i<arr.length;i++){
            if(i == arr.length - 1) {
                result = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }
        }
        result = result + "]";
        System.out.println(result);
    }
}
