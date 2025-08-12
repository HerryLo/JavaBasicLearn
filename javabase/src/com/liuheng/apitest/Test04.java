package com.liuheng.apitest;

public class Test04 {
    public static void main(String[] args) {
        toParseInt("123");
        toBinaryStr(8);
    }

    // 字符串数字转成数字
    public static void toParseInt(String str) {
        String regex = "[1,9]\\d{1,9}";
        if(!str.matches(regex)) {
            System.out.println("字符串中只能是数字不能有其他字符");
            return;
        }

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            result = result*10 + num;
        }
        System.out.println(result);
        return;
    }

    // 十进制转二进制
    public static void toBinaryStr(int num) {
        String result = "";
        while (true) {
            if(num == 0){
                break;
            }
            int num1 = num % 2;
            result =  String.valueOf(num1) + result;
            num = num/2;
        }
        System.out.println(result);
    }
}
