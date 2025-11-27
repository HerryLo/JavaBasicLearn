package com.javabase02.networktest;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest01 {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8888);
            Socket socket = server.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            Scanner scanner = new Scanner(is)){
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os, "gbk"),true);
            pw.println("你好啊，我是正在测试socket实例的菜鸟开发，回复关键字[2050] 可以查看更多内容！");

            boolean done = false;
            while (!done && scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);

                if("2050".equals(line)) {
                    done = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
