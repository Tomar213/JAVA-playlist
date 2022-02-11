package com.company;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ( x%2 == 0 ){
            if(x>=2 && x<=5  ){
                System.out.println("Not Weird");
                return;
            }
        }
        if(x%2== 0){
            if(x>=6 && x<= 20){
                System.out.println("weird");
                return;
            }
        }
        if(x%2==0 && x>20){
            System.out.println("Not Weird");

        }
        else{
            System.out.println("Weird");
        }
    }
}
