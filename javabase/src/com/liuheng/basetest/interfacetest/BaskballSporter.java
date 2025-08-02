package com.liuheng.basetest.interfacetest;

public class BaskballSporter extends Sporter{
    public BaskballSporter() {
    }

    public BaskballSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
