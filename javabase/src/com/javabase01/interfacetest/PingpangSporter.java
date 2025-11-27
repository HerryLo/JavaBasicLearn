package com.javabase01.interfacetest;

public class PingpangSporter extends Sporter implements English{
    public PingpangSporter() {
    }

    public PingpangSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }
}
