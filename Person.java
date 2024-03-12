package day9.serializationdemo.inheritance;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID =1234567890;
	protected int adharNo;
	protected String name;
	
	public Person() {}
	public Person(int adharNo, String name) {
		this.adharNo = adharNo;
		this.name = name;
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
