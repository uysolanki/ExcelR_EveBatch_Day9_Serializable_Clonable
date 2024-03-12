package day9.serializationdemo.aggregation;

import java.io.Serializable;

public class Engine implements Serializable  {
	
	private int engineID;
	private String engineMfgname;
	
	public Engine() {}
	public Engine(int engineID, String engineMfgname) {
		this.engineID = engineID;
		this.engineMfgname = engineMfgname;
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
	
	
	
	

}
