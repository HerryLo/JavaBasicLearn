package com.javabase02.iotest;

import java.io.*;
import java.util.HashMap;

public class CharStreamTest04 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String,String> hm = new HashMap<>();

        try(BufferedReader fr = new BufferedReader(new FileReader("resource\\text01.txt"));
            BufferedWriter fw = new BufferedWriter(new FileWriter("resource\\copytext01.txt"));) {
            String line = null;
            while ((line = fr.readLine()) != null){
                if(line.isEmpty()){
                    continue;
                }

                String[] arr = line.split("\\.");
                hm.put(arr[0],arr[1]);
            }

            hm.entrySet().forEach(entry -> {
                String key = entry.getKey();
                String value = entry.getValue();
                try {
                    fw.write(key +"."+ value);
                    fw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
