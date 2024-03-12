package day9.clonabledemo;

import java.io.Serializable;

public class Engine implements Cloneable  {
	
	private int engineID;
	private String engineMfgname;
	
	public Engine() {}
	public Engine(int engineID, String engineMfgname) {
		this.engineID = engineID;
		this.engineMfgname = engineMfgname;
	}
	
	public Engine(Engine e1)
	{
		this.engineID = e1.engineID;
		this.engineMfgname = e1.engineMfgname;
	}
	
	public int getEngineID() {
		return engineID;
	}
	public void setEngineID(int engineID) {
		this.engineID = engineID;
	}
	public String getEngineMfgname() {
		return engineMfgname;
	}
	public void setEngineMfgname(String engineMfgname) {
		this.engineMfgname = engineMfgname;
	}
	@Override
	public String toString() {
		return "Engine [engineID=" + engineID + ", engineMfgname=" + engineMfgname + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
