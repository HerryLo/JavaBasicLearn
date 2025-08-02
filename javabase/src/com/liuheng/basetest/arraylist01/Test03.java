package com.liuheng.basetest.arraylist01;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();

        Student st1 = new Student("liuheng", 29);
        Student st2 = new Student("xioaming", 22);

        al.add(st1);
        al.add(st2);
        for (int i=0;i<al.size();i++){
            Student st = al.get(i);
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
