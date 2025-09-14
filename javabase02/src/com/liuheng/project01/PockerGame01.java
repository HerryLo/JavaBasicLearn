package com.liuheng.project01;

import java.util.*;

public class PockerGame01 {
    static ArrayList<String> pokers = new ArrayList<>();

    static {
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String n : numbers){
            for (String c : colors) {
                String value = c + n;
                pokers.add(value);
            }
        }

        pokers.add("小王");
        pokers.add("大王");
    }

    public PockerGame01() {
        Collections.shuffle(pokers);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < pokers.size(); i++) {
            String value = pokers.get(i);
            if(i<3) {
                lord.add(value);
                continue;
            }

            if(i%3 == 0) {
                player1.add(value);
            }else if(i%3 == 1){
                player2.add(value);
            }else {
                player3.add(value);
            }
        }

        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }
}
