package com.company;
class overloading {
    void display() {
        System.out.println("this is no parameter method  ");
    }

    void display(int a) {
        System.out.println("this is " + a + "  parameterise method implementing method overloading ");

    }
}
class overridding extends overloading{
    @Override
    void display() {
        System.out.println("this is overriden method");
    //    super.display();
    }
}
public class Over{
    public static void main(String[] args) {
      overloading ovr = new overloading();
      ovr.display();
      ovr.display(1);
      overridding ord = new overridding();
      ord.display();



    }
}
