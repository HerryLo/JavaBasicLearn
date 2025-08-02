package com.liuheng.datatype;

public class Test01 {
    public static void main(String[] args) {
        int len = 10;
        double f = 1.2313132;
        float fl = 1123123123;
        long lo = 1421232301;
        System.out.println(f);
        System.out.println(fl);
        System.out.println(lo);
        int TotalNumber = FuncForNumber(1000);
        System.out.println(TotalNumber);
    }

    public static int FuncForNumber(int len) {
        int total = 0;
        for(int i=0; i<len;i++) {
            total += i;
        }
        return total;
    }
}
