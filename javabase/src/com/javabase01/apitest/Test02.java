package com.javabase01.apitest;

import com.google.gson.Gson;

public class Test02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        CloneUser cu = new CloneUser(data,"lh","123456","\\");

        // Object中的clone方法是浅克隆
        CloneUser clonecu = (CloneUser) cu.clone();
        data[0] = 99;
        //System.out.println(cu);
        //System.out.println(clonecu);

        //导入外部jar包类, Gson中的toJson方法转成JSON，然后在通过fromJson方法还原成对象，达到深克隆目的
        Gson gs = new Gson();
        CloneUser cu01 = gs.fromJson(gs.toJson(cu),CloneUser.class);
        System.out.println(cu01);
        System.out.println(gs.toJson(cu01));
        data[0] = 88;
    }
}
