package com.javabase02.iotest;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteStreamTest03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
       try(ObjectOutputStream oos = new ObjectOutputStream(buffer)) {
           oos.writeInt(12345);
           oos.writeUTF("HELLO");
           oos.writeObject(Double.valueOf(123.456));
       } catch (Exception e) {
           e.printStackTrace();
       }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}
