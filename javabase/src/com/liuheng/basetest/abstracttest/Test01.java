package com.liuheng.basetest.abstracttest;

public class Test01 {
    public static void main(String[] args) {
        Dog d = new Dog(1,"汪汪");
        Cat c = new Cat(1,"哇哇");

        showInfo(d);
        d.drink();
        d.eat();

        showInfo(c);
        c.drink();
        c.eat();
    }

    public static void showInfo(Animal a){
        System.out.println(a.getName()+","+a.getAge());
    }
}
