package Pertemuan12.parsingJson;

public class ServicePackage {
	private String service;
	private int value;
	
	@Override
	public String toString() {
		String print = "Paket Pengiriman: " + this.service + "\nHarga Pengiriman: " + this.value + "\n";
		return print;
	}
}
