package first;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileHandling {
	public static void main(String[] args) {

        // code to create a file;
File myFile = new File("prac.txt");
try {
myFile.createNewFile();
} catch (IOException e) {
System.out.println("FILE CREATION FAILED");
e.printStackTrace();
}
System.out.println("file has been created.......");

        // CODE TO WRITE TEXT IN A FILE
try {
FileWriter f = new FileWriter("prac.txt");
f.write("THIS IS FILE HANDLING PROGRAM IN eclipse IDE ...\n THANK YOU ..................");
f.close();
} catch (IOException e) {
e.printStackTrace();
}
System.out.println("AND DATA ADDED...");
}
}
