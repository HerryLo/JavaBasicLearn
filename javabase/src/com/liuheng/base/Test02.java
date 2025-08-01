package com.liuheng.base;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 机票价格分为淡季和旺季，头等舱和经济舱。输入机票原价，月份，头等舱或经济舱；
        // 旺季（5-8月）头等5折，经济8.5折扣; 淡季（11月到来年4月）头等7折，经济6.5折;

        Scanner sc = new Scanner(System.in);
        System.out.print("输入机票原价：");
        int tickt = sc.nextInt();
        System.out.print("输入当前月份(1-12)：");
        int mouth = sc.nextInt();
        System.out.print("选择当前购买仓位(头等舱 0;经济舱 1)：");
        int type = sc.nextInt();

        double discount = judgeDiscount(mouth,type);
        int price = (int) (discount*tickt);

        System.out.println("当前机票价格为："+price);
    }

    public static double judgeDiscount(int mouth, int type) {
        if(mouth >=5 && mouth <= 8) {
            if(type == 0) {
                return 0.5;
            }
            return 0.85;
        }else if(mouth >= 11 || (mouth <= 4 || mouth >= 1)) {
            if(type == 0) {
                return 0.7;
            }
            return 0.65;
        }
        return 1;
    }
}
