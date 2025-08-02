package com.liuheng.string02;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        // StringJoiner快速拼接字符串的容器
        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("abc").add("fff").add("eee");

        System.out.println(sj);
        System.out.println(sj.toString());
    }
}
