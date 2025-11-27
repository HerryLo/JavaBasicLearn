package com.javabase01.string01;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // 将数字字符串转换，例如：123 转换为 壹佰贰拾叁元
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String result = "";
        while (true) {
            int ge = number%10;
            number = number/10;
            result = numberTranfer(ge) + result;
            if(number == 0) {
                break;
            }
        }
        System.out.println(result);

        String[] units = {"元","拾","佰","仟", "万", "拾", "佰", "仟"};

        String result1 = "";
        for (int i = result.length()-1;i>=0;i--){
            int unitIndex = result1.length() == 0 ? result1.length() : result1.length()/2;
            result1 = result.charAt(i) + units[unitIndex] + result1;
        }
        System.out.println(result1);
    }

    public static String numberTranfer(int i) {
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[i];
    }
}
