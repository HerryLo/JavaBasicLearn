package com.liuheng.basetest.string01;

public class Test04 {
    public static void main(String[] args) {
        String str = "abcdef";

        // 遍历字符串
        for (int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i));
        }

        // 统计字符串中大写字母字符，小写字母字符，数字字符出现的次数
        String str1 = "HellWorld123";
        int bigCount = 0;
        int samllCount = 0;
        int numberCount = 0;
        for (int i=0;i<str1.length();i++) {
            char s = str1.charAt(i);
            if(s >= 'a' && s <= 'z') {
                // char类型的变量在参与计算的时候，会自动类型提升为int，查询ascii表
                samllCount++;
            }else if(s >= 'A' && s <= 'Z'){
                bigCount++;
            }else if(s >= '0' && s <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字符有："+bigCount+"个");
        System.out.println("小写字符有："+samllCount+"个");
        System.out.println("数字字符有："+numberCount+"个");
    }
}
