package com.liuheng.interfacetest;

public class Test1 {
    public static void main(String[] args) {
        PingpangSporter pps = new PingpangSporter(20, "小美");
        BaskballSporter bbs = new BaskballSporter(23,"小帅");
        PingpangCoach ppc = new PingpangCoach(20, "张三");

        pps.study();
        pps.speakEnglish();

        bbs.study();

        ppc.teach();
        ppc.speakEnglish();
    }
}
