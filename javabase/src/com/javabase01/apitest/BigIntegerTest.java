package com.javabase01.apitest;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bi= new BigInteger("999");
        BigInteger bi1= new BigInteger("111111101",2);// 将radix进制的数转换成十进制
        BigInteger bi2= new BigInteger("012210",3);// 将3进制的数转换成十进制

        System.out.println(bi);
        System.out.println(bi1);
        System.out.println(bi2);

        BigInteger bi3 = bi2.add(bi1);
        System.out.println(bi3);

        BigDecimal bd = new BigDecimal("1.2244234234234");
        BigDecimal bd1 = new BigDecimal(0.01);//不推荐这样使用
        BigDecimal bd2 = new BigDecimal("0.01");
        BigDecimal bd3 = new BigDecimal("0.09");

        System.out.println(bd);
        System.out.println(new BigDecimal(0.2/0.3));
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(0.09 + 0.01);
        System.out.println(bd2.add(bd3));
    }
}
