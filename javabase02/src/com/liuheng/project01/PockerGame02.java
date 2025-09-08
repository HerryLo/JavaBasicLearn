package com.liuheng.project01;

import java.util.*;

// 记录扑克牌存储下标，发牌后，通过TreeSet保证扑克牌顺序
public class PockerGame02 {

    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> pokers = new ArrayList<>();

    static {
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int count = 0;

        for (String n : numbers){
            for (String c : colors) {
                String value = c + n;
                pokers.add(count);
                hm.put(count, value);
                count++;
            }
        }

        pokers.add(count);
        hm.put(count, "大王");
        count++;
        pokers.add(count);
        hm.put(count, "小王");
    }

    public PockerGame02() {
        Collections.shuffle(pokers);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < pokers.size(); i++) {
            Integer value = pokers.get(i);
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

        loadPoker("1号选手",player1);
        loadPoker("2号选手",player2);
        loadPoker("3号选手",player3);
    }

    static void loadPoker(String name, TreeSet<Integer> list) {
//        Collections.sort(list);
        for (Integer index : list) {
            String poker = hm.get(index);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
