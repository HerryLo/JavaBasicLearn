package com.javabase02.reflectiontest;

import java.lang.reflect.Method;

public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = Person.class;
        Method method1 = cls.getMethod("getName");
        Method method2 = cls.getMethod("setName", String.class);

        System.out.println(method1);
        System.out.println(method1.getName());
        System.out.println(method1.getReturnType());
        System.out.println(method1.getParameterTypes());
        System.out.println(method1.getModifiers());

        System.out.println(method2);
        System.out.println(method2.getName());
        System.out.println(method2.getReturnType());
        System.out.println(method2.getParameterTypes());
        System.out.println(method2.getModifiers());


    }
}
