package com.liuheng.ui;

import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        char[] chars = new char[52];
        //A-Z：65-90
        for (int i = 0; i < 26; i++) {
            int num = i+65;
            char c = (char) num;
            chars[i] = c;
        }
        
        //a-z: 97-122
        for (int i = 0; i < 26; i++) {
            int num = i+97;
            char c = (char) num;
            chars[i+26] = c;
        }

        StringBuilder sb = new StringBuilder();
        Random ra = new Random();
        for (int i = 0; i < 4; i++) {
            int index = ra.nextInt(chars.length);
            sb.append(chars[index]);
        }

        int number = ra.nextInt(9);
        sb.append(number);

        System.out.println(sb.toString());
        return sb.toString();
    }
}
