package com.javabase02.test;

public class EnumTest07 {
    enum WeekTypes{
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE
    }

    public static void main(String[] args) {
        String str = checkWeekType(WeekTypes.TWO);
        System.out.println(str);
    }

    static String checkWeekType(WeekTypes weekType) {
        return switch (weekType) {
            case ONE -> "周一";
            case TWO -> "周二";
            case THREE -> "周三";
            case FOUR -> "周四";
            case FIVE -> "周五";
        };
    }
}
