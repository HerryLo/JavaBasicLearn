package com.javabase01.string01;

public class Test01 {
    public static void main(String[] args) {
        // 基础类型比较的是数据值，引用类型比较的地址值
        // 字符串中只要是new出来的，都会到堆中开辟一个空间
        String str1 = new String("abc");
        // 字符串直接赋值，会在串池开辟一个空间，同时系统会检查该字符串在串池中是否存在
        String str2 = "abc";
        System.out.println(str1 == str2);// 使用==引用类型比较地址值

        String str3 = new String("abc");
        String str4 = "abc";
        System.out.println(str3.equals(str4));// 使用equals比较数据值


    }
}
