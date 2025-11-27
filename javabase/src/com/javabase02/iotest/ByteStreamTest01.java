package com.javabase02.iotest;

import java.io.*;

public class ByteStreamTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("resource\\F1视频会议一体机开箱视频.mp4");
        String outfile = "resource\\output.mp4";

        if(file.isFile()){
            try(FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(outfile);){
                int len = 0;
                byte[] bytes = new byte[1024 * 1024];
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
            }catch(RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
