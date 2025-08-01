package com.liuheng.interfacetest;

public class PingpangCoach extends Coach implements English{
    public PingpangCoach() {
    }

    public PingpangCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
