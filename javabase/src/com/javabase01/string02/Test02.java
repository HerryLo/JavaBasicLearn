package com.javabase01.string02;

public class Test02 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "bcdea";

        boolean state = check(A, B);
        System.out.println(state);
    }

    public static boolean check(String str, String str2) {
        for(int i=0;i<str.length();i++) {
            str = firstMove(str);
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String firstMove(String str) {
        String first = str.substring(0,1);
        String end = str.substring(1);
        return end + first;
    }
}
