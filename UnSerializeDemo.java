package day9.serializationdemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UnSerializeDemo {

	public static void main(String[] args) {
		Demo d2=null;
		String filename="myfile.txt";
		
		try
		{
			FileInputStream file = new FileInputStream(filename);
		    ObjectInputStream in = new ObjectInputStream(file);
		    d2=(Demo)in.readObject();
		    System.out.println(d2.a);
		    System.out.println(d2.b);
		    System.out.println("E : " +d2.e);
		    System.out.println("F : " +d2.f);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}

	}

}
