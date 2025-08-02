package com.liuheng.basetest.arraylist01;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Phone> al = new ArrayList<>();

        Phone ph1 = new Phone("苹果",6999);
        Phone ph2 = new Phone("小米",5999);
        Phone ph3 = new Phone("华为",12999);

        al.add(ph1);
        al.add(ph2);
        al.add(ph3);

        ArrayList<Phone> result = checkPriceList(al, 7000);
        for (Phone ph : result) {
            System.out.println(ph.getBrand()+","+ph.getPrice());
        }
    }

    public static ArrayList<Phone> checkPriceList(ArrayList<Phone> al, double price) {
        ArrayList<Phone> aList = new ArrayList<>();

        for (Phone ph : al) {
            if (price > ph.getPrice()) {
                aList.add(ph);
            }
        }

        return aList;
    }
}
