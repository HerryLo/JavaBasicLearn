package com.javabase02.test;

public class StringTest06 {
    public static void main(String[] args) {

        String str1 = "123123";
        str1 = "345";

        StringBuilder sb1 = new StringBuilder();
        char[] charlist = str1.toCharArray();
        for (char ch: charlist) {
            System.out.println(ch);
            sb1.append(ch);
        }
        String str2 = sb1.toString();
        System.out.println(str2);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("123123");
        sb2.append("567567");
        System.out.println(sb2.toString());

        System.out.println(new Writer("lh", 12));
    }
}

