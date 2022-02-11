//  question) Java Program to Find Largest Between Three Numbers Using Ternary Operator

package com.company;
import java.io.*;
public class Ternary {
    public static void main(String[] args) {
        int num1=10,num2 = 6, num3 = 7;
        int max, high, lar;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);
        max = (num1>num2)?num1:num2;
        high = (max>num1)?max:num1;
        lar = (high>num3)?high:num3;
        System.out.println("Greater = "+lar);

    }
}
