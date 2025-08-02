package com.liuheng.basetest.object;

public class GameTest {
    public static void main(String[] args) {
        Role ro1 = new Role("乔峰", 100, "男");
        Role ro2 = new Role("鸠摩智", 100,"男");

        while (true) {
            ro1.attack(ro2);
            if(ro2.getBlood() == 0) {
                System.out.println(ro1.getName()+"KO了"+ro2.getName());
                break;
            }

            ro2.attack(ro1);
            if(ro1.getBlood() == 0) {
                System.out.println(ro2.getName()+"KO了"+ro1.getName());
                break;
            }
        }
    }
}
