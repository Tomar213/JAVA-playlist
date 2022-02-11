package first;

import java.io.*;

public class OutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =  new FileOutputStream("rory2.txt");
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