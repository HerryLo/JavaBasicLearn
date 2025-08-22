package com.liuheng.apitest;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Test04 {
    public static void main(String[] args) throws ParseException {
//        toParseInt("123");
//        toBinaryStr(8);
//        calculateDays("1995-10-01");
        clacLeapyear();
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

    public static void calculateDays(String str) throws ParseException {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(str);
        long nowtime = now.getTime();
        long birthdaytime = birthday.getTime();
        long days1 = (nowtime - birthdaytime) / 1000 / 60 / 60 / 24;
        System.out.println(days1);

        LocalDate ld = LocalDate.of(1995,10,1);
        LocalDate ld1 = LocalDate.now();
        long days2 = ChronoUnit.DAYS.between(ld, ld1);
        System.out.println(days2);
    }

    // 计算闰年
    public static void clacLeapyear() {
        // java7
        Calendar cl = Calendar.getInstance(); //得到日历对象
        cl.set(2000,2,1,0,0);// 设置年月日
        cl.add(Calendar.DAY_OF_MONTH, -1);// 当前月份天数减一
        int days1 = cl.get(Calendar.DAY_OF_MONTH);// 获取当前月份天数
        System.out.println(days1);

        //java8
        LocalDate ld = LocalDate.of(2000,3,1);// 本地时间设置年月日
        LocalDate ld1 = ld.minusDays(1);// 天数减一
        int days2 = ld1.getDayOfMonth();// 获取当前月份天数
        System.out.println(days2);
    }

}
