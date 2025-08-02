package com.liuheng.basetest.interfacetest;

public interface English {
    void speakEnglish();

    public default void readEglish() {
        System.out.println("读英语");
    }
}
