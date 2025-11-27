package com.javabase01.interfacetest;

public interface English {
    void speakEnglish();

    public default void readEglish() {
        System.out.println("读英语");
    }
}
