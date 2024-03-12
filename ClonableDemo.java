package day9.clonabledemo;

public class ClonableDemo {

	public static void main(String[] args) {
		Engine e1=new Engine(1,"Honda");
		System.out.println("E1 :" +e1);
//		//shallow copy
//		Engine e2=e1;
//		System.out.println(e2.getEngineMfgname());
//		System.out.println(e1==e2) //true;
//		//deep copy
//		Engine e3=new Engine();
//		e3.setEngineID(e1.getEngineID());
//		e3.setEngineMfgname(e1.getEngineMfgname());
		Engine e2=null;
		try {
			e2=(Engine)e1.clone();
		} catch (CloneNotSupportedException e) 
		{
			System.out.println(e);
		}
		
		System.out.println("E2 :" +e2);
		System.out.println(e1==e2); //true;
	}

}
