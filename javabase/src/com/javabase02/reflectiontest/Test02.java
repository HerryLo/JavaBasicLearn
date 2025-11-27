package com.javabase02.reflectiontest;

import java.lang.reflect.Field;

public class Test02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Person p = new Person(18,"liuheng");

        System.out.println(p.getName());
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("name");
        System.out.println(f);
        f.setAccessible(true);
        f.set(p, "liuheng0111");
        System.out.println(p.getName());
    }
}
