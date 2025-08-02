package com.liuheng.datatype;

public class MethodTest01 {
    public static void main(String[] args) {
        System.out.println("start method");
        method1();
        int a = 10, b = 9, c = 199;
        int total = getSum(a, b);
        System.out.println(a +"+"+ b +"="+total);
        int totalThree = getSum(a, b, c);
        System.out.println(a +"+"+ b+"+"+c+"="+totalThree);
    }

    public static void  method1() {
        System.out.println("method1 menthod");
        method2();
    }

    public static void  method2() {
        System.out.println("method2 menthod");
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
