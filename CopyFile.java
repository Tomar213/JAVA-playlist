package com.company;
import java.io.*;
import  java.util.*;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileReader fin  = new FileReader("karan_m.txt");
        FileWriter fout = new FileWriter("rory.txt", true);
        int c;
        while((c=fin.read())!=-1){
            fout.write(c);
        }
        System.out.println("copying finished ...............");
        fin.close();
        fout.close();
    }
}
