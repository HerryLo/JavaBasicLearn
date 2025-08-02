package com.liuheng.arraylist01;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        // 集合只能放引用类型
        ArrayList<String> al = new ArrayList<>();

        al.add("打钱！");
        al.add("加工资");
        al.add("绩效调整");
        al.add("薪资调整");
        al.add("强制降薪");
        al.add("裁员");

        StringBuilder result = new StringBuilder("[");
        for (int i=0;i<al.size();i++) {
            String str = al.get(i);
            if(i < al.size() - 1) {
                result.append(str).append(",");
            }else {
                result.append(str);
            }
        }
        result.append("]");
        System.out.println(result);
    }
}
