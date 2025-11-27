package com.javabase02.exceptiontest;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) throws Exception {
        try {
            byte[] bs = toGBK("中文");
            System.out.println(Arrays.toString(bs));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            System.out.println("END");
        }

        String a = "12";
        String b ="x9";

        try {
            int c = stringToInt(a);
            int d = stringToInt(b);
            System.out.println(c * d);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: "+e.getMessage());
        } finally {
            System.out.println("END");
        }

    }

    static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }

    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
