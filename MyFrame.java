package com.company;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class MyFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My first awt frame");

        f.setSize(600, 400);
        f.setBackground(Color.yellow);
      //  f.setShape();
        f.setVisible(true);

        f.addWindowListener(new Myclass());
        System.out.println("success............");
    }
}
class Myclass extends  WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}
// class Draw1 extends  Frame{
//    Draw1(){
//        this.addWindowFocusListener(new WindowAdapter(){});
//    }
//
//}



