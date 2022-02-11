package com.company;
import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =  new FileOutputStream("rory.txt");
            String s = " THIS IS THE OUTPUT STREAM EXAMPLE ";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println(" success..................");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
