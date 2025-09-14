package com.liuheng.project01;

import java.util.*;

// 通过积分数字对应扑克牌数字，保证扑克顺序
public class PockerGame03 {

    static HashMap<String, Integer> hm = new HashMap<>();
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

        pokers.add(" 小王");
        pokers.add(" 大王");

        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",99);
        hm.put("大王",100);
    }

    public PockerGame03() {
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

        sort(lord);
        sort(player1);
        sort(player2);
        sort(player3);

        loadPoker("底牌",lord);
        loadPoker("1号选手",player1);
        loadPoker("2号选手",player2);
        loadPoker("3号选手",player3);
    }

    static void sort(ArrayList<String> list) {
        Collections.sort(list, (o1, o2) -> {
            Integer num1 = pokerValue(o1);
            Integer num2 = pokerValue(o2);
            return num1 - num2;
        });
    }

    static Integer pokerValue(String o) {
        String value = o.substring(1);
        if(hm.containsKey(value)) {
            return hm.get(value);
        } else {
            return Integer.parseInt(value);
        }
    }

    static void loadPoker(String name, ArrayList<String> list) {
//        Collections.sort(list);
        for (String str : list) {
            String poker = str;
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
