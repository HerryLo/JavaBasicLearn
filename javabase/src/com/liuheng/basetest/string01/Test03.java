package com.liuheng.basetest.string01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 字符串比较
        String username = "liuheng";
        String password = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username1 = sc.next();
        System.out.println("请输入密码：");
        String password1 = sc.next();
        if(username.equals(username1) && password.equals(password1)){
            System.out.println("恭喜您登录成功");
        }else {
            System.out.println("登录失败，用户名或密码错误！");
        }
    }
}
