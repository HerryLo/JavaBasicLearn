package com.liuheng.basetest.innerclass;

public class Test01 {
    public static void main(String[] args) {
        Outer o = new Outer();

        o.new Inner().show();
    }
}
