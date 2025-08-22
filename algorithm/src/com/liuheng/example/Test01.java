package com.liuheng.example;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person(18,160,"小美","女");
        Person p2 = new Person(18,170,"小甜甜","女");
        Person p3 = new Person(18,175,"小王","男");
        Person p4 = new Person(18,185,"小帅","男");
        Person[] parray = {p1, p2, p3, p4};

        Arrays.sort(parray, (o1, o2)-> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            if(temp > 0) {
                return 1;
            }else if(temp < 0) {
                return -1;
            }else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(parray));
    }
}
