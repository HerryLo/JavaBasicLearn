package com.liuheng.genericstest;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        // 泛型通配符
        ArrayList<Ye> l1 = new ArrayList<>();
        ArrayList<Fu> l2 = new ArrayList<>();
        ArrayList<Zi> l3 = new ArrayList<>();

//        method(l1);
        method(l2);
        method(l3);
    }

//    ? super Fu 支持传递父类和自己
//    public static void method(ArrayList<? super Fu> arr) {
//
//    }

    // ? extends Fu 支持传递自己和子类
    public static void method(ArrayList<? extends Fu> arr) {

    }
}

class Ye{};
class Fu extends Ye{};
class Zi extends Fu{};
