package com.javabase01.string01;

public class Test06 {
    public static void main(String[] args) {
        // 字符串反转
        String str = "abcde";
        String newStr = "";
        for (int i = str.length() - 1;i>=0;i--) {
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
    }
}
