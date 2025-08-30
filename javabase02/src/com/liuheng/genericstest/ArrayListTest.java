package com.liuheng.genericstest;

import java.util.Arrays;

public class ArrayListTest<T> {
    private Object[] arr = new Object[10];
    private int size = 0;

    public ArrayListTest() {
    }

    public boolean add(T e) {
        arr[size] = e;
        size++;
        return true;
    }

    public T get(int i){
        return (T) arr[i];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
