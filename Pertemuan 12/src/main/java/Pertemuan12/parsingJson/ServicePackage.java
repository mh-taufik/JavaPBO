package Pertemuan12.parsingJson;

public class ServicePackage {
	private String service;
	private int value;
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return this.service + " | " + this.value + " | ";
	}
}
