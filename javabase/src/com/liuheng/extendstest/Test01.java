package com.liuheng.extendstest;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person(30,"老王");

        Animal a1 = new Dog(1,"黄白");
        Animal a2 = new Cat(2,"黑白");

        p1.keppPet(a1,"骨头");
        p1.keppPet(a2,"鱼干");

        System.out.println(a1.num);
        System.out.println(((Dog) a1).num);
    }


}
