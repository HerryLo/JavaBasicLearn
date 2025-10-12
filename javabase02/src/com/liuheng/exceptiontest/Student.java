package com.liuheng.exceptiontest;

public class Student {
    private String name;
    private int age;

    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 6 || name.length() > 40){
            throw new NameFormatException(name + "：名字格式有误，长度应该为：6 ~ 40");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
