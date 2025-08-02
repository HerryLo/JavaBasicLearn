package com.liuheng.basetest.arraylist01;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<User> al = new ArrayList<>();

        User user1 = new User("12345","lh","123456");
        User user2 = new User("12378","ll","123456");
        User user3 = new User("12389","hh","123456");

        al.add(user1);
        al.add(user2);
        al.add(user3);

        boolean state = checkId(al,"12345");
        System.out.println(state);

        int index = checkIndex(al,"12389");
        System.out.println(index);
    }

    public static boolean checkId(ArrayList<User> al, String id){
        for (int i = 0; i < al.size(); i++) {
            User us = al.get(i);
            if(id.equals(us.getId())){
                return true;
            }
        }
        return false;
    }

    public static int checkIndex(ArrayList<User> al, String id){
        for (int i = 0; i < al.size(); i++) {
            User us = al.get(i);
            if(id.equals(us.getId())){
                return i;
            }
        }
        return -1;
    }
}
