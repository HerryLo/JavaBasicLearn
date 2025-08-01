package com.liuheng.object02;

import com.liuheng.object01.Product;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr1 = new GirlFriend[4];

        // 创建4个女朋友对象
        GirlFriend gf1 = new GirlFriend("小美",18,"女","吃热狗");
        GirlFriend gf2 = new GirlFriend("小贝",25,"女","爬山");
        GirlFriend gf3 = new GirlFriend("小玫",26,"女","拍照");
        GirlFriend gf4 = new GirlFriend("小薇",22,"女","下厨");

        arr1[0]= gf1;
        arr1[1]= gf2;
        arr1[2]= gf3;
        arr1[3]= gf4;
        int sum = 0;
        for (GirlFriend gf : arr1) {
            sum = sum + gf.getAge();
        }
        int avgAge = sum/ arr1.length;
        System.out.println("女友平均年龄："+avgAge);

        System.out.println("低于平均年龄人员信息如下：");
        for (GirlFriend gf : arr1) {
            if(gf.getAge() < avgAge) {
                System.out.println("姓名："+gf.getName());
                System.out.println("年龄："+gf.getAge());
                System.out.println("性别："+gf.getGander());
                System.out.println("爱好："+gf.getHobby());
            }
        }

    }
}
