package day9.serializationdemo;

import java.io.Serializable;

public class Demo implements Serializable {
	private static final long serialVersionUID =1234567890;
	int a;
	String b;
	int c;
	transient int e;
	static int f=99;
	public Demo() {}
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	
}
