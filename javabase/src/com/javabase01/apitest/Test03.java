package com.javabase01.apitest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (arrayList.size() < 5) {
            System.out.print("请输入字符串：");
            String i1 = sc.next();

            arrayList.add(Integer.parseInt(i1));
        }

        System.out.println(arrayList);
    }
}
