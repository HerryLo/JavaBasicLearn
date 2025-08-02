package com.liuheng.datatype;

import java.util.Random;


public class Test03 {
    public static void main(String[] args) {
        //  生成四位随机字母
        char[] cr = new char[52];
        for (int i = 0; i<cr.length;i++) {
            if(i<=25) {
                // 小写a-z
                cr[i] = (char) (97 + i);
            }else {
                // 大写A-Z
                cr[i] = (char) (65 + i - 26);
            }
        }

        StringBuilder result = new StringBuilder();
        Random rd = new Random();
        for (int i = 0;i<4;i++) {
            int rdIndex = rd.nextInt(cr.length);
            result.append(cr[rdIndex]);
        }
        System.out.println(result);
    }
}
