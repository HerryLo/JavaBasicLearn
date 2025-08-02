package com.liuheng.string02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(checkStr(str)) {
            System.out.println("字符串通过校验，转换：");
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++) {
                char ch = str.charAt(i);
                int index = ch-48;
                sb.append(numberTranfer(index));
            }
            System.out.println(sb);
        }else {
            System.out.println("校验不通过，字符串长度必须小于等于9，且必须是数字");
        }
    }

    public static String numberTranfer(int i) {
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[i];
    }

    public static boolean checkStr(String str) {
        if(str.length() > 9) {
            return false;
        }

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
