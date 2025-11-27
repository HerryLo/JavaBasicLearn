package com.javabase02.iotest;

import java.io.*;

public class ByteStreamTest02 {
    public static void main(String[] args) throws IOException {
        long starttime = System.currentTimeMillis();

        File file = new File("resource\\test.txt");

          try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
//        try(FileInputStream bis = new FileInputStream(file)){
            int b = 0;
            StringBuilder sb = new StringBuilder();
            while ( (b = bis.read()) != -1){
                char ch = (char) b;
                 sb.append(ch);
            }
            // System.out.println(sb.toString());

        }catch (RuntimeException e) {
            e.printStackTrace();
        }

        long endtime = System.currentTimeMillis();
        System.out.println("开始时间："+starttime);
        System.out.println("结束时间："+endtime);
        System.out.println((endtime - starttime) + "毫秒");
    }
}
