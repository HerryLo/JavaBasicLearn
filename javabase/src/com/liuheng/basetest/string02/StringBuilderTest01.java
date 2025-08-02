package com.liuheng.basetest.string02;

import java.util.Scanner;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 判对称字符串，如：123321，111
        System.out.print("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = sb.append(str).reverse().toString();

        if(str.equals(result)) {
            System.out.println("该字符串是对称字符串");
        }else {
            System.out.println("该字符串不是对称字符串");
        }
    }
}
