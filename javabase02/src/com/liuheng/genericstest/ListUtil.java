package com.liuheng.genericstest;

import java.util.ArrayList;
import java.util.Arrays;

public class ListUtil {
    private ListUtil() {}

    public static<T> void addAll(ArrayListTest<T> arr, T el1, T el2, T el3, T el4, T el5){
        arr.add(el1);
        arr.add(el2);
        arr.add(el3);
        arr.add(el4);
        arr.add(el5);
    }
}
