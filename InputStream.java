package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputStream {
    public static void main(String[] args) {


        File fin = new File("rory.txt");
        try {
            Scanner s = new Scanner(fin);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
