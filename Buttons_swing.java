package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Buttons_swing extends JFrame implements  ActionListener {
//    JCheckBox cb1,cb2;
//    JTextArea ta;
//    JRadioButton rb1,rb2;
//    String msg = " ";
    Buttons_swing(){

        Container c = getContentPane();
        JLabel lb = new JLabel("courses");
        JTextArea ta= new JTextArea(20,30);
        JCheckBox cb1 = new JCheckBox("java",true);
        JCheckBox cb2 = new JCheckBox("c lang");
        JRadioButton rb1 = new JRadioButton("male", true);
        JRadioButton rb2  = new JRadioButton("female");

        setLayout(null);
       // lb.setBounds(20,10,50,30);
  // ta.setBounds(50,50,80,50);
   //ta.setBackground(Color.blue);
   rb1.setBounds(20,10,160,100);
        rb2.setBounds(20,60,160,150);

        c.add(ta);
        c.add(rb1);
        c.add(rb2);
        c.add(cb1);
        c.add(cb2);

        cb1.addActionListener(this);
        cb2.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);

       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        Buttons_swing bs = new Buttons_swing() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        bs.setSize(300,300);
        bs.setVisible(true);
        bs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
