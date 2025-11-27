package com.javabase01.extendstest;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keppPet(Animal a, String something) {
        if(a instanceof Dog d) {
            System.out.println(name+"养了一只"+ a.getAge()+"岁且"+a.getColor()+"色的狗");
            a.eat(something);
        }else if(a instanceof Cat c) {
            System.out.println(name+"养了一只"+ a.getAge()+"岁且"+a.getColor()+"色的猫");
            a.eat(something);
        }

    }
}
