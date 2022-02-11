package com.company;
import java.io.*;

class Machine implements Serializable{
    int id ;
    String name;
   Machine(int id , String name){
       this.id =id;
       this.name= name;
   }

}
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Machine mac = new Machine(2009,"Karan");
        FileOutputStream fout = new FileOutputStream("f.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(mac);
        fout.close();
        System.out.println("object serialization complete...........");


        FileInputStream fis = new FileInputStream("f.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
       Machine mac1 = (Machine) ois.readObject();
        System.out.println("Deserialisation complete............");
        System.out.println(mac1.id +"  "+ mac1.name);
      fis.close();

    }
}
