package com.javabase01.extendstest;

public class Dog extends Animal{

    public int num = 30;

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死抱住"+something+"猛吃");
    }
}
