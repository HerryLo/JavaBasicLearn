package com.liuheng.exceptiontest;

public class Test01 {
    public static void main(String[] args) {

        try{
            Student s = new Student("abababbabab",18);
            s.setName("abab");
        } catch (NameFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
