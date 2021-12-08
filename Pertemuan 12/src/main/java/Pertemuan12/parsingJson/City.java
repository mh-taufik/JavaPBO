package Pertemuan12.parsingJson;

public class City {
	private String origin, destination;
	
	@Override
	public String toString() {
		String print = "Kota Asal: " + this.origin + "\nKota Tujuan: " + this.destination + "\n\n";
		return print;
	}
}
