package com.company;

public class Graphics {
    public static void main(String[] args) {
        int a = 30;
        int b = -30;
        int c =0 ;
        System.out.println(" 30 =  "+ Integer.toBinaryString(a));
        System.out.println(" -30 =  "+ Integer.toBinaryString(b));
        System.out.println("........Signed Right Shift  ..................");
        c=a>>1;
        System.out.println(" 30>>1 =  "+ Integer.toBinaryString(c));
        c=b>>1;
        System.out.println(" -30>>1 =  "+ Integer.toBinaryString(c));

    }
}
