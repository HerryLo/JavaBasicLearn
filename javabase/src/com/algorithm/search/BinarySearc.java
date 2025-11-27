package com.algorithm.search;

public class BinarySearc {
    public static void main(String[] args) {
        // 二分查找
        // 要求是有数的数组，按照升序或降序排列
        int[] arr = {1,4,6,10,23,45,76,89,99};
        int num = 111;

        BinarySearch(arr, num);
    }

    public static void BinarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int index = 0;

        while (true){
            if(min > max) {
                System.out.println("数字不存在");
                index = -1;
                break;
            }

            int mid = (min+max)/2;
            int el = arr[mid];

            if(el > num) {
                max = mid - 1;
            }else if(el < num) {
                min = mid + 1;
            }else if(el == num) {
                index = mid;
                break;
            }
        }
        System.out.println(index);
    }
}
