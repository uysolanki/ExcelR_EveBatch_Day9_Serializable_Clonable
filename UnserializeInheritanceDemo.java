package day9.serializationdemo.inheritance;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import day9.serializationdemo.Demo;

public class UnserializeInheritanceDemo {

	public static void main(String[] args) {
		Student s2=null;
		String filename="myfileInheritance.txt";
		
		try
		{
			FileInputStream file = new FileInputStream(filename);
		    ObjectInputStream in = new ObjectInputStream(file);
		    s2=(Student)in.readObject();
		    System.out.println(s2.getAdharNo());
		    System.out.println(s2.getName());
		    System.out.println(s2.getRno());
		    System.out.println(s2.getStream());
		}
		catch(Exception e1) {
			System.out.println(e1);
		}


	}

}
