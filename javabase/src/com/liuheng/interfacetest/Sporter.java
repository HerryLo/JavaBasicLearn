package com.liuheng.interfacetest;

public abstract class Sporter extends Person{

    public abstract void  study();

    public Sporter() {
    }

    public Sporter(int age, String name) {
        super(age, name);
    }
}
