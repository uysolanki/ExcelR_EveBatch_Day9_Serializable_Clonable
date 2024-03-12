package day9.serializationdemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Demo d1=new Demo(1,"Alice");
		String filename="myfile.txt";
		
	try
	{
	FileOutputStream file = new FileOutputStream(filename);
    ObjectOutputStream out = new ObjectOutputStream(file);
    out.writeObject(d1);
    
    System.out.println("Serialization Successfull");
    
    file.close();
    out.close();
	}
	catch(Exception e1)
	{
		
	}
}
}
