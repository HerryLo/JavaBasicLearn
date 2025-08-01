package com.liuheng.string01;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        String str2 = "abc";
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str5 = sc.next();// new出来的
        System.out.println(str2 == str5);// false
    }
}
