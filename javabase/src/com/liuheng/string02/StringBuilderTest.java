package com.liuheng.string02;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "13995578453";
        String beginStr = str.substring(0,3);
        String endStr = str.substring(7);
        System.out.println(beginStr+"****"+endStr);

        StringBuilder sb = new StringBuilder();
        sb.append("abc").append("123").append("ccc");
        String beginStr1 = sb.toString().substring(0,3);
        System.out.println(beginStr1);
    }
}
