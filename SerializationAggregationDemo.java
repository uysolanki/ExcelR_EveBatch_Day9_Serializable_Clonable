package day9.serializationdemo.aggregation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationAggregationDemo {

	public static void main(String[] args) {
		Engine e1=new Engine(1,"Honda");
		Car c1=new Car("Q3","Audi",1000,e1);
		
		String filename="myfile.txt";
		
		try
		{
		FileOutputStream file = new FileOutputStream(filename);
	    ObjectOutputStream out = new ObjectOutputStream(file);
	    out.writeObject(c1);
	    
	    System.out.println("Serialization Successfull");
	    
	    file.close();
	    out.close();
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}

	}

}
