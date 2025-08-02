package com.liuheng.arraylist01;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        // int对应包装类Integer，char对应包装类Character
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < al.size(); i++) {
            if(i < al.size() - 1){
                result.append(al.get(i)).append(",");
            }else {
                result.append(al.get(i));
            }
        }
        result.append("]");
        System.out.print(result.toString());
    }
}
