package day9.serializationdemo.inheritance;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeInheritanceDemo {

	public static void main(String[] args) {
		Student s1=new Student(1111,"Alice",101,"Engineering");
		String filename="myfileInheritance.txt";
		
		try
		{
		FileOutputStream file = new FileOutputStream(filename);
	    ObjectOutputStream out = new ObjectOutputStream(file);
	    out.writeObject(s1);
	    
	    System.out.println("Serialization using Inheritance Successfull");
	    
	    file.close();
	    out.close();
		}
		catch(Exception e1)
		{
			
		}

	}

}
