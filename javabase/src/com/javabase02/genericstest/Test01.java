package com.javabase02.genericstest;

public class Test01 {
    public static void main(String[] args) {
        // 泛型类
        ArrayListTest<String> arr = new ArrayListTest();

        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
//        System.out.println(arr);
//        System.out.println(arr.get(1));
//        System.out.println(arr.size());

        // 泛型方法
        ListUtil.addAll(arr,"ddd","eee","fff","fff","fff");
        System.out.println(arr);

        // 泛型接口
        ListTest arrlist = new ListTest();
        arrlist.add("123");
    }
}
